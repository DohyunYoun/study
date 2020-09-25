package algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Algorithm Study TusedayOHMS 4nd
 *
 * Created by DohyunYoun on 2020-06-15
 * SITE : https://www.acmicpc.net/problem/2156
 * <p>
 * Used Algorithm : DP
 * Used Data Structure :
 * Time Complexity :
 * Point : 연속 2잔까지 마실 수 있다.
 */
public class Boj2156 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wines = new int[n+1];
        for(int i = 1 ; i < n+1 ; i++){
            wines[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(new Boj2156().drinkWine(wines));
        StringBuilder sb;
        StringBuffer sf;
        String s;

    }


    int drinkWine(int[] wines){
        int len = wines.length;
        if(len <= 2){
            return wines[1];
        } else if(len <= 3){
            return wines[1]+wines[2];
        }
        int[] dp = new int[len];
        dp[1] = wines[1];
        dp[2] = wines[1]+wines[2];
        dp[3] = max(wines[1], wines[2]) + wines[3];

        for(int i = 4 ; i < len ; i++){
            //현재 와인을 무조건 마셔야됨. 근데 안마실 수도 있어.
            //wine 1 1 1 1 1 30
            //dp   1 2 2

            /**
             * 1 1 30 50 20
             *
             * current = 5
             * dp[i-3] + arr[i-1] + arr[i] = 2 + 50 + 20 = 72
             * dp[i-2] + arr[i] = 31 +  20 = 51
             * dp[i-1] = 1 + 30 + 50 = 81
             *
             * 1 10 10 1
             */
            dp[i] = max(dp[i-2], dp[i-3]+ wines[i-1]) + wines[i];
            //현재 와인을 안마시는 경우도 찾아서 해줘야함.
            //            dp[i] = max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i], dp[i-1]);
        }
        return max(dp[len-2], dp[len-1]);
    }

    int max(int a, int b){
        return a > b ? a : b;
    }
}
