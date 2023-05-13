class Solution {
    fun decodeMessage(key: String, message: String): String {
        val alphabet = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
        var result = ""
        val modifiedKey = key.replace(" ", "").toCharArray().distinct()
        message.forEach { keyword ->
            result += if (keyword == ' ') {
                keyword
            } else {
                alphabet[modifiedKey.indexOf(keyword)]
            }
        }
        return result
    }
}