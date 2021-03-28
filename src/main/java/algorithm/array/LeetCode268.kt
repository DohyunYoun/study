package algorithm.array

class LeetCode268 {
    fun missingNumber(nums: IntArray): Int {
        nums.sort()
        nums.forEachIndexed { i, n ->
            if(n != i) return i
        }
        return nums.size

        // return nums.size * (nums.size + 1) / 2 - nums.sum()
    }
}