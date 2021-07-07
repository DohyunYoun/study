package algorithm.implementation

class LeetCode1423 {
    fun maxScore(cardPoints: IntArray, k: Int): Int {

        var max = 0

        cardPoints.forEachIndexed { index, num ->
            val lastIndex = index + k
            if (lastIndex > cardPoints.size) return max
            max = Math.max(cardPoints.slice(index..lastIndex).sum(), max)
        }

        return max
    }
}