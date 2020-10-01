package algorithm.greedy;
//https://www.hackerrank.com/challenges/angry-children/problem

import java.util.Arrays;

/**
 * arr에 있는 값들 중 k개를 뽑았을 때,
 * max(a,b) - min(a,b)의 값이 가장 작은 값을 구하시오.
 * <p>
 * - arr는 중복된 값이 존재할 수 있다.
 * 2 <= n <= 10^5
 * 2 <= k <= n
 * 0 <= arr[i] <= 10^9
 */
public class HackerrankMaxMin {
    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - k + 1; i++) {
            min = Math.min(min, arr[i + k - 1] - arr[i]);
        }
        return min;
    }

}
