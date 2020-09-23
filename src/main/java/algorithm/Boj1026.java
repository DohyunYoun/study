package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int SIZE = Integer.parseInt(br.readLine());

        Integer[] A = new Integer[SIZE];
        Integer[] B = new Integer[SIZE];

        int big = 0;
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < SIZE; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < SIZE; i++) {
            B[i] = Integer.parseInt(st.nextToken());
            big = Math.max(big, B[i]);
        }

        int[] biggest = new int[big + 1];
        for (int i = 0; i < SIZE; i++) {
            biggest[B[i]] = 1;
        }

        Arrays.sort(A, Collections.reverseOrder());

        int j = 0;
        for (int i = 0; i < big + 1; i++) {
            if (biggest[i] == 1) {
                sum += A[j] * i;
                j++;
            }
        }
        System.out.println(sum);
    }
}
