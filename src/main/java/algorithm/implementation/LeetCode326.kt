package algorithm.implementation

import java.lang.Math.sqrt
import kotlin.math.log
import kotlin.math.roundToInt

class LeetCode326 {
//    fun isPowerOfThree(n: Int): Boolean {
//        if (n < 1) return false
//        var n = n
//
//        while (n % 3 == 0) {
//            n /= 3
//        }
//        return n == 1
//    }

    fun isPowerOfThree(n: Int): Boolean {
        val result = log(n.toDouble(), 3.0)
        // 999 ㄷㅓ블은 실수형이어서 오차범위가 있음
//        return result == Math.floor(result)
        return roundUp(result).compareTo(result.roundToInt()) == 0
    }

    fun roundUp(n: Double): Double {
        return (n + 4) / 5 * 5
    }
}