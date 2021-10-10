package algorithm.string

class Programmers86051 {
    fun solution(numbers: IntArray): Int {
        val original = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        return original.subtract(numbers.toList()).sum()
    }
}