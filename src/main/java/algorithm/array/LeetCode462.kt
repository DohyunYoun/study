package algorithm.array

import java.util.*
import kotlin.math.abs


class LeetCode462 {

    /***
     * 평균 '값' 으로 만들면? -> [1,0,0,8,6]에서 충족하지 못함.
     * 배열에 '있는 값' 중에 중간 값으로 맞추기.
     */
    fun minMoves2(nums: IntArray): Int {
        var result = 0
        nums.sort()
        val avg = nums[nums.size / 2]
        nums.forEach {
            result += abs(avg - it)
        }
        return result
    }

    //WRONG ANSWER
//    fun minMoves2(nums: IntArray): Int {
//
//        val avg = nums.average().toInt()
//        var minMove = 0
//        var result = 0
//
//        //avg
//        result = minMove(nums, avg)
//
//        //down
//        for (i in avg - 1 downTo 1) {
//            minMove = minMove(nums, i)
//            if (result < minMove) break
//            else result = minMove
//        }
//
//        //up
//
//        for (i in avg + 1..nums.maxOrNull()!!) {
//            minMove = minMove(nums, i)
//            if (result < minMove) break
//            else result = minMove
//        }
//
//        return result
//    }
//
//    fun minMove(nums: IntArray, avg: Int): Int {
//        var result = 0
//        nums.forEach {
//            result += abs(avg - it)
//        }
//        return result
//    }

}