package algorithm;

import java.util.Arrays;


public class LeetCode628 {
    /**
     * sort : O(nlogn)
     * 9 ms	41.7 MB
     */
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        final int LEN = nums.length;

        return Math.max((nums[0] * nums[1] * nums[LEN - 1]), (nums[LEN - 1] * nums[LEN - 2] * nums[LEN - 3]));
    }

    /**
     * one pass
     * space : O(1)
     * time : O(n)
     * <p>
     * 2 ms	41.3 MB
     */
    public int maximumProductSolution(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
