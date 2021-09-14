package algorithm.array

class LeetCode153 {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right: Int = nums.size - 1

        while (left < right) {
            val mid: Int = (left + right) / 2
//            val mid = left + (right - left) / 2 //overflow(left+right)
//            if (nums[mid] < nums[right]) {
//                right = mid
//            } else if (nums[mid] > nums[right]) {
//                left = mid + 1
//            }

            if (nums[left] < nums[mid]) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return nums[left]
    }
}