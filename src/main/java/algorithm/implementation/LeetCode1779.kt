package algorithm.implementation

import java.lang.Math.abs

/**
 * 문제 : x나 y가 같은 포인트들 중 맨하탄 거리값이 가장 작은 포인트의 인덱스를 찾으시오
 */
class LeetCode1779 {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {

        var index = -1
        var distance = Integer.MAX_VALUE

        points.forEachIndexed { i, ints ->
            val pointX = ints[0]
            val pointY = ints[1]
            if (pointX == x || pointY == y) {
                val pointDistance = abs(pointX - x) + abs(pointY - y)
                if (distance > pointDistance) {
                    distance = pointDistance
                    index = i
                }
            }
        }
        return index
    }
}