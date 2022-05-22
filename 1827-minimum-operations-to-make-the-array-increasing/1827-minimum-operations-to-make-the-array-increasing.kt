class Solution {
    fun minOperations(nums: IntArray): Int {
        if(nums.size <2) return 0
        var result = 0
        (1..nums.size-1).forEach { i ->
           if (nums[i - 1] >= nums[i]){
               val increment = nums[i - 1] - nums[i] + 1
            result += increment
            nums[i] += increment
           }
        }
        return result
    }
}