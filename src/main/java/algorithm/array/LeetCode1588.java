package algorithm.array;

public class LeetCode1588 {
    //https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
    //1 ms	36.2 MB
    public int sumOddLengthSubarrays(int[] arr) {
        final int LEN = arr.length;
        int sum = arr[0];
        int[] dp = new int[LEN];
        dp[0] = arr[0];
        for (int i = 1; i < LEN; i++) {
            //1개짜리
            sum += arr[i];
            dp[i] = dp[i - 1] + arr[i];
        }

        int odd = 3;
        while (odd <= LEN) {
            int i = odd - 1;
            while (i < LEN) {
                if (i - odd < 0) {
                    sum += dp[i];
                } else {
                    sum += dp[i] - dp[i - odd];
                }
                i++;
            }
            odd += 2;
        }
        return sum;
    }

    //Time : O(N)
    //Space : O(1)
    //0 ms	36.6 MB
    public int sumOddLengthSubarraysSolution(int[] arr) {
        int res = 0, n = arr.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return res;
    }
}
