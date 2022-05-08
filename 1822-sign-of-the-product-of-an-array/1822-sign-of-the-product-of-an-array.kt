class Solution {
    fun arraySign(nums: IntArray): Int {
        //int range error
//        val result = nums.reduce { acc, i ->
//            acc * i
//        }
        var result = nums.first()
        (1 until nums.size).forEach { index ->
            result *= nums[index]
            result = setSign(result)
        }
        return setSign(result)
    }

    private fun setSign(value: Int): Int {
        return when {
            value == 0 -> return 0
            value > 0 -> 1
            else -> -1
        }
    }
}