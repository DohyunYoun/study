package algorithm.string

class Programmers76501 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        signs.forEachIndexed { i, sign ->
            if (sign) {
                answer += absolutes[i]
            } else {
                answer -= absolutes[i]
            }
        }
        return answer
    }
}