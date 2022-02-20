package algorithm.implementation

class LeetCode1768 {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = ""

        val word1Length = word1.length
        val word2Length = word2.length

        word1.forEachIndexed { index, c ->
            if (word1Length >= word2Length) {
                result += c
                if (word2Length > index) {
                    result += word2[index]
                }
            } else {
                result += c
                result += word2[index]
                if (word1Length - 1 == index) {
                    result += word2.substring(index+1)
                }
            }
        }
        return result
    }
}

fun main() {
    println(LeetCode1768().mergeAlternately("ab", "pqrs"))
    println(LeetCode1768().mergeAlternately("abcd", "pq"))

}