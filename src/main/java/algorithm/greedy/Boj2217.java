package algorithm.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/2217
public class Boj2217 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] rope = new int[N];
        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);
        int max = rope[0] * N;
        for (int i = 1; i < N; i++) {
            int newMax = rope[i] * (N-i);
            if(max < newMax){
                max = newMax;
            }
        }

        System.out.println(max+"");
    }
}
