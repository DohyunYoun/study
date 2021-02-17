package algorithm.string

import kotlin.math.*

class LeetCode821 {
    //232 ms	37.4 MB
    //    fun shortestToChar(s: String, c: Char): IntArray {
//        val ret = mutableListOf<Int>()
//        val indices = mutableListOf<Int>()
//        s.forEachIndexed { index, now ->
//            if (now == c) indices.add(index)
//        }
//        s.forEachIndexed { index, now ->
//            var min = Int.MAX_VALUE
//            val minIndex = indices.map {
//                Math.abs(index - it)
//            }.minByOrNull { it } ?:Int.MAX_VALUE
//            min = Math.min(min,  minIndex)
//            ret.add(min)
//        }
//        return ret.toIntArray()
//    }

    //176 ms	35.9 MB
    fun shortestToChar(s: String, c: Char): IntArray {
        val result = IntArray(s.length)
        var leftIndex = s.indexOf(c)
        var rightIndex = s.indexOf(c, leftIndex + 1)
        s.forEachIndexed { index, _ ->
            if(rightIndex == -1){
                result[index] = abs(index - leftIndex)
            }else{
                val left =  abs(index - leftIndex)
                val right =  abs(index - rightIndex)
                result[index] = min(left, right)
            }

            if (index == rightIndex) {
                leftIndex = rightIndex
                rightIndex = s.indexOf(c, leftIndex + 1)
            }
        }
        return result
    }

}