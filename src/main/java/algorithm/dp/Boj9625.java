package algorithm.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by DohyunYoun on 2020-08-25
 * SITE : https://www.acmicpc.net/problem/9625
 * <p>
 * Used Algorithm : DP?? Math...
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj9625 {
    /**
     * A -> B
     * B -> BA
     *
     * A   > B   > BA  > BAB > BABBA > BABBABAB
     * 1 0 > 0 1 > 1 1 > 1 2 > 2 3   > 3 5
     * A : B의 개수
     * B : A의 개수 + B의 개수
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int click = Integer.parseInt(br.readLine());

        int countA = 1;
        int countB = 0;

        while(click!=0){
            int tmpA = countA;
            countA = countB;
            countB = tmpA + countB;
            click--;
        }
        System.out.println(countA + " "+countB);
    }
}
