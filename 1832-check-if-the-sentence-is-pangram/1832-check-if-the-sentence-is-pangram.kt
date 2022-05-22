class Solution {
    fun checkIfPangram(sentence: String): Boolean {
     val ALPHABET_SIZE = 26
        return sentence.toSet().size == ALPHABET_SIZE
    }
}