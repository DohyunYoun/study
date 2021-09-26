package algorithm.string

class Leetcode125 {
    fun isPalindrome(s: String): Boolean {
        var str = s.replace("[^A-Za-z0-9]+".toRegex(), "")
        str = str.toLowerCase()
        var left = 0
        var right = str.length - 1
        while (left <= right) {
            if (str[left] != str[right]) return false
            left++
            right--
        }
        return true
    }

}

fun main() {
    val result = Leetcode125().isPalindrome("Ab00_a")
    println(result)
}