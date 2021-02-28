package algorithm.implementation

fun main() {
    LeetCode1342().numberOfSteps(14)
}

class LeetCode1342 {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var count = 0
        while (number != 0) {
            number = if (number % 2 == 0) number / 2 else number - 1
            count++
        }
        return count
    }
}