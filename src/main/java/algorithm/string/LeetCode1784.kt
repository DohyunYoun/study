package algorithm.string

/**
 * 문제 : 다음 2진수가 0으로 시작하는게 없으면 true
 */
class LeetCode1784 {
    fun checkOnesSegment(s: String): Boolean {
        return "01" !in s
//        return !s.contains("01")
    }
}