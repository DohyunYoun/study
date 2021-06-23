package algorithm.implementation

class LeetCode1387 {
    fun getKth(lo: Int, hi: Int, k: Int): Int {
        val map = mutableMapOf<Int,Int>()
        (lo..hi).forEach {
            map[it] = getSteps(it, 0)
        }
        return map.toList().sortedWith(compareBy { it.second })[k-1].first
    }

    fun getSteps(n: Int, steps: Int): Int {
        if (n == 1) return steps

        val isEven: Boolean = n % 2 == 0
        return if (isEven) {
            getSteps(n / 2, steps + 1)
        } else {
            getSteps(3 * n + 1, steps + 1)
        }
    }
}