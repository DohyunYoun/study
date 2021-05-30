package algorithm.implementation

import java.lang.Math.sqrt

class LeetCode326 {
    fun isPowerOfThree(n: Int): Boolean {
        if (n < 1) return false
        var n = n

        while (n % 3 == 0) {
            n /= 3
        }
        return n == 1
    }
}