package algorithm.string

class LeetCode5 {
    fun isPalindrom(s: String): Boolean {
        return s == s.reversed()
    }

    fun longestPalindrome(s: String): String {
        val LEN = s.length

        var longestLen = 0
        var longestIdx = 0

        for (i in 0 until LEN) {
            if (isPalindrom(s.substring(i - longestLen, i))) {
                longestLen += 1
                longestIdx = i
            } else if (i - longestLen - 1 >= 0
                    && isPalindrom(s.substring(i - longestLen - 1, i))) {
                longestLen += 2
                longestIdx = i
            }
        }
        longestIdx++
        return s.substring(longestIdx - longestLen, longestIdx)

    }
}