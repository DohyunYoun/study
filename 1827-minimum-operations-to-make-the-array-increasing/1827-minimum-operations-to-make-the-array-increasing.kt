class Solution {
    fun minOperations(nums: IntArray): Int {
            var left = nums[0]
        var result = 0
        (1..nums.size-1).forEach { index ->
            val right = nums[index]
            if (left >= right) {
                result += left - right + 1
                left++
            } else {
                left = right
            }
        }
        return result
    }
}