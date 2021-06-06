package algorithm.array

class LeetCode1480 {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }
        return nums
    }
}
