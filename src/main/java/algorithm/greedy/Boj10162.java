package algorithm.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by DohyunYoun on 2020-08-25
 * SITE : https://www.acmicpc.net/problem/10162
 * <p>
 * Used Algorithm : Greedy
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj10162 {
    /**
     * A : 300s
     * B : 60s
     * C : 10s
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        int btnA = 300;
        int btnB = 60;
        int btnC = 10;

        if (time % 10 != 0) {
            System.out.println("-1");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(time / btnA);
            time = time % btnA;
            sb.append(" ");
            sb.append(time / btnB);
            time = time % btnB;
            sb.append(" ");
            sb.append(time / btnC);

            System.out.println(sb.toString());
        }

    }
}
