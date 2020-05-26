package TusedayOHMS;

import java.util.*;

//https://fbtmdwhd33.tistory.com/59
//https://zoonvivor.tistory.com/152
public class Baekjoon1912 {
	static int n; // N 변수
	static int dp[],cost[]; // 메모이제이션 배열과 각 값을 저장 할 배열
	
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		dp = new int[n+1];
		cost = new int[n+1];
		
		for(int i=1;i<=n;i++) { // 각 값을 입력
			cost[i] = sc.nextInt();
		}
		
		dp[1] = cost[1]; // dp 1번 인덱스의 경우는 자기 자신밖에 될 수 없다.
		for(int i=2;i<=n;i++) { // dp 1번 인덱스가 초기화 되어 있으므로 2번 인덱스부터 탐색 시작
			dp[i] = Math.max(dp[i-1]+cost[i], cost[i]); // 자기 자신과 이전까지 누적값 + 자기자신의 값 중 큰 값을 취한다.
		}
		
		int max =Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			if(dp[i] > max)
				max = dp[i];
		}
		
		System.out.println(max); // 완성된 dp 배열에서 최댓값을 찾아 출력
		
	}
	
}