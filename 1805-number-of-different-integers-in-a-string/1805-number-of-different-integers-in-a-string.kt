class Solution {
    fun numDifferentIntegers(word: String): Int {
    var strDigits = ""
    val digitSet = mutableSetOf<BigInteger>()
    word.forEach {
        if (it.isDigit()) strDigits += it
        else {
            if (strDigits.isNotBlank()) {
                digitSet.add(strDigits.toBigInteger())
                strDigits = ""
            }
        }
    }
    if (strDigits.isNotBlank()) {
        digitSet.add(strDigits.toBigInteger())
    }
    return digitSet.size
    }
}