class Solution {
    fun minOperations(nums: IntArray): Int {
        if(nums.size <2) return 0
        var result = 0
        (1..nums.size-1).forEach { i ->
           if (nums[i - 1] >= nums[i]){
            result += nums[i - 1] - nums[i] + 1
            nums[i] += nums[i - 1] - nums[i] + 1
           }
        }
        return result
    }
}