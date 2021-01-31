package algorithm.string;

import java.util.Arrays;

public class LeetCode1646 {
    public int getMaximumGenerated(int n) {
        if (n < 2) return n;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 0; i < nums.length / 2; i++) {
            nums[2 * i] = nums[i];
            nums[2 * i + 1] = nums[i] + nums[i + 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
