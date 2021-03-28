package algorithm.implementation

class LeetCode575 {
    fun distributeCandies(candyType: IntArray): Int {
        return Math.min(candyType.toSet().size, candyType.size / 2)
//        return Math.min(candyType.distinct().size, candyType.size / 2)
    }
}