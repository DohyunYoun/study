package algorithm.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by DohyunYoun on 2020-06-11
 * SITE : https://www.acmicpc.net/problem/2869
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int v= Integer.parseInt(st.nextToken());

      System.out.println(  new Boj2869().solve(a,b,v));

    }

    int solve(int a, int b, int v){
        //달팽이는 하루에 (A - B) 미터 씩 총 V미터를 올라가면 된다.
        //하지만 달팽이가 목표 지점에 도달한 날에는 미끄러지는 것을 감안하면 안되니
        // 총 (V - B)미터를 올라가게 되는 것과 같다.
        // 만약 (V - B)가 (A - B)로 딱 나눠 떨어지지 않으면 몫에 + 1 한 것이 정답이다 (하루 더 가니까).
        // 근데 int형 이라서 나눠 떨어지는지 구분하기 귀찮으니까 (V -B)에 1을 미리 빼놓고 몫에 무조건 1을 더하는 것으로 처리한다.
        return (v-b-1) / (a-b) +1;
    }
}
