package algorithm.implementation

import java.lang.Math.abs

class Programmers67256 {
    val left = "L"
    val right = "R"

    val middles = intArrayOf(2, 5, 8, 0)
    var currentLeft = -1
    var currentRight = -1

    fun solution(numbers: IntArray, hand: String): String {

        var answer = ""

        numbers.forEach {
            answer += when (it) {
                1, 4, 7 -> {
                    setLeft(it)
                }
                3, 6, 9 -> {
                    setRight(it)
                }
                else -> {
                    //2, 5, 8, 0
                    val leftDistance = getDistance(currentLeft, it, 1)
                    val rightDistance = getDistance(currentRight, it, -1)

                    when {
                        leftDistance < rightDistance -> setLeft(it)
                        leftDistance > rightDistance -> setRight(it)
                        else -> if (hand == "left") setLeft(it) else setRight(it)
                    }
                }
            }

        }
        return answer
    }

    private fun getDistance(start: Int, end: Int, makeMiddle: Int): Int {
        return if (middles.contains(start)) {
            abs(middles.indexOf(end) - middles.indexOf(start))
        } else {
            1 + abs(middles.indexOf(end) - middles.indexOf(if (start == -1) 0 else start + makeMiddle))
        }
    }

    private fun setLeft(current: Int): String {
        currentLeft = current
        return left
    }

    private fun setRight(current: Int): String {
        currentRight = current
        return right
    }
}