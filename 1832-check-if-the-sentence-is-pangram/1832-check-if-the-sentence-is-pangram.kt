class Solution {
    fun checkIfPangram(sentence: String): Boolean {
           val PANGRAM = "abcdefghijklmnopqrstuvwxyz"
        return sentence.toList().distinct().sorted().joinToString("") == PANGRAM
    }
}