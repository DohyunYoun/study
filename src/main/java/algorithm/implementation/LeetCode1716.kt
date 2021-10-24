package algorithm.implementation

class LeetCode1716 {
    fun totalMoney(n: Int): Int {
        val dayOfWeek = intArrayOf(1, 3, 6, 10, 15, 21, 28)
        val value: Int = n / 7
        val remain: Int = n % 7

        var next = 0
        for (i in 0 until value) {
            next += i
        }

        val week = if (value > 0) (dayOfWeek[6] * value) + (next * 7) else 0
        val days = if (remain > 0) dayOfWeek[remain - 1] + (value * remain) else 0

        return week + days
    }
}

fun main() {
    println("${LeetCode1716().totalMoney(4)}, 10")
    println("${LeetCode1716().totalMoney(10)}, 37")
    println("${LeetCode1716().totalMoney(26)}, 135")
}