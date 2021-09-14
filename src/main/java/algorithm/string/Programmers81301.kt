package algorithm.string

import java.lang.StringBuilder

class Programmers81301 {
    fun solution(s: String): Int {
        val answer = StringBuilder()
        val map = mutableMapOf(
                "ze" to 0,
                "on" to 1,
                "tw" to 2,
                "th" to 3,
                "fo" to 4,
                "fi" to 5,
                "si" to 6,
                "se" to 7,
                "ei" to 8,
                "ni" to 9
        )
        s.forEachIndexed { i, c ->
            if (c.isDigit()) {
                answer.append(c)
            } else {
                if (i + 2 > s.length) return@forEachIndexed
                answer.append(map[s.substring(i, i + 2)] ?: "")
            }
        }

//        var answer = s
//
//        val map = mutableMapOf<String, Int>(
//                "zero" to 0,
//                "one" to 1,
//                "two" to 2,
//                "three" to 3,
//                "four" to 4,
//                "five" to 5,
//                "six" to 6,
//                "seven" to 7,
//                "eight" to 8,
//                "nine" to 9
//        )
//
//
//        map.forEach { (key, value) ->
//            answer = answer.replace(key, value.toString())
//        }
//
//        return answer.toInt()
    }
}