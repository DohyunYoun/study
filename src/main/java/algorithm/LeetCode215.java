package algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class LeetCode215 {
    //O(N lg N) running time + O(1) memory
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];

    }
}
