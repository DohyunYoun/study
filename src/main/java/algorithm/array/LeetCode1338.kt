package algorithm.array

class LeetCode1338 {
    fun minSetSize(arr: IntArray): Int {
        var size = arr.size
        val MAX_SIZE = size / 2

        val map = mutableMapOf<Int, Int>()
        arr.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        var result = 0
        map.values.sortedByDescending { it }.forEach { frequency ->
            if (size - frequency <= MAX_SIZE)
                return ++result
            else {
                result++
                size -= frequency
            }
        }
        return result
    }
}