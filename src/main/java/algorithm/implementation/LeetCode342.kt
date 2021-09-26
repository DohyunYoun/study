package algorithm.implementation

class LeetCode342 {
    fun isPowerOfFour(n: Int): Boolean {
        if (n == 0) return false
        return n == 1 || (n % 4 == 0 && isPowerOfFour(n / 4))
    }
}