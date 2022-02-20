package algorithm.implementation

class LeetCode1748 {
    fun sumOfUnique(nums: IntArray): Int {
        val distinctNums = mutableListOf<Int>()
        nums.forEach {
            if (!distinctNums.contains(it)) {
                distinctNums.add(it)
            }
        }
        return distinctNums.sum()
    }
}

fun main() {
    print(LeetCode1748().sumOfUnique(intArrayOf(1, 1, 1, 1, 1)))
}