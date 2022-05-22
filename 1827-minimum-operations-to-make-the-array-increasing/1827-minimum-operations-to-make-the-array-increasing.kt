class Solution {
    fun minOperations(nums: IntArray): Int {
            var left = -1
        var result = 0
        nums.forEach { right->
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