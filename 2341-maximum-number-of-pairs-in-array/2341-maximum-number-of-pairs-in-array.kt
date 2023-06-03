class Solution {
    fun numberOfPairs(nums: IntArray): IntArray {
         if (nums.size == 1) return intArrayOf(0, 1)
        var i = 0
        var pairCount = 0
        var leftoverCount = 0


        nums.sort()

        while (i < nums.size ) {
             if (i == nums.size - 1) {
                leftoverCount++
                break
            }

            if (nums[i] == nums[i + 1]) {
                i += 2
                pairCount++
            } else {
                i++
                leftoverCount++
            }

        }
        return intArrayOf(pairCount, leftoverCount)
    }
}