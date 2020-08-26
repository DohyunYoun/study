package algorithm.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1946
public class Boj1946 {
    /**
     * 큰 수로 정렬하고 바로 다음거랑 비교, 둘다 크면 삭제?
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            int len = Integer.parseInt(br.readLine());
            int[][] candidates = new int[len][2];
            for (int j = 0; j < len; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                candidates[j][0] = Integer.parseInt(st.nextToken());
                candidates[j][1] = Integer.parseInt(st.nextToken());
            }
            System.out.println(maxMembers(candidates, len)+"");
        }
    }

    static int maxMembers(int[][] candidates, int len) {
        Arrays.sort(candidates, ((o1, o2) -> Integer.compare(o2[0], o1[0])));
        int result = len;
        for(int i = 0; i < len-1; i ++){
            if(candidates[i][0] > candidates[i+1][0] && candidates[i][1] > candidates[i+1][1]){
                result--;
            }
        }
        return result;
    }
}
