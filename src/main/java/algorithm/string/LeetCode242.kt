package algorithm.string

//https://leetcode.com/problems/valid-anagram/
//이전 java 풀이 : ./study/vscode/solved/ValidAnagram242.java
fun main() {
    LeetCode242().isAnagram("anagram", "nagaram")
}

class LeetCode242 {

    fun isAnagram(s: String, t: String): Boolean {
        //256 ms	36.5 MB
        return s.groupBy { it } == t.groupBy { it }

        //256 ms	42.8 MB
//        return s.sort() == t.sort()
    }

    fun String.sort() = String(toCharArray().apply { sort() })
}