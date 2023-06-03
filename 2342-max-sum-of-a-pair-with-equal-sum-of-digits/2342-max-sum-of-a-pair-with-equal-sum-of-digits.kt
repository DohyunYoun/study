class Solution {
         fun maximumSum(nums: IntArray): Int {
//        val sumOfDigits = nums.map { num -> num.toString().map { it.digitToInt() }.sum() }
        val sumOfDigits = nums.map { num -> num.toString().map { it.toInt() - '0'.toInt() }.sum() }
        var maxSum = -1
        val trash = arrayListOf<Int>()

        sumOfDigits.forEachIndexed { index, num ->
            if (!trash.contains(num)) {
                val pairIndex = arrayListOf<Int>()
                sumOfDigits.forEachIndexed { index, i ->
                    if (i == num)
                        pairIndex.add(index)
                }

                if (pairIndex.size > 1) {
                    trash.add(num)
                    for (i in 0 until pairIndex.size) {
                        for (j in i + 1 until pairIndex.size) {
                            maxSum = max(maxSum, nums[pairIndex[i]] + nums[pairIndex[j]])
                        }
                    }
                }
            }
        }
        return maxSum
         }
}
