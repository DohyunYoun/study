package algorithm.string

class LeetCode520 {
    fun detectCapitalUse(word: String): Boolean {
        // 1. All letters are capitals
        // 2. All letters are not capitals
        // 3. Only the First letter is capital
        if (word.length <= 1) return true
        val firstCapital = word[0].isUpperCase()
        val onlyFirstCapital = firstCapital && word[1].isLowerCase()
        (1..word.length).forEach {
            val c = word[it]
            if (firstCapital) {
                if (onlyFirstCapital) {
                    if (c.isUpperCase()) return false
                } else {
                    if (c.isLowerCase()) return false
                }
            } else {
                if (c.isUpperCase()) return false
            }
        }
        return true
    }
}