package algorithm.string

//https://leetcode.com/problems/count-binary-substrings/
/**
 * 순서를 바꾸지 않고, 0과 1의 개수가 같도록 묶을때 나올 수 있는 경우의 수
 * 0과 1은 한번에 묶여야 한다.
 */
class LeetCode696 {
    fun countBinarySubstrings(s: String): Int {
        var result = 0
        var isGroup = true
        var count = 0
        s.forEachIndexed { i, c ->
            var left = c
            val before = c
            count++
            for (j in i + 1 until s.length) {
                val right = s[j]
                if (left == right && before != right) {
                    count++
                } else {
                    if ( count == 0) {
                        result++
                        break
                    }
                    left = right
                    count--
                    isGroup = false
                }
                if(j == s.length -1 && count == 0 && !isGroup){
                    result++
                }
            }

            count = 0
            isGroup = true
        }
        return result
    }
}