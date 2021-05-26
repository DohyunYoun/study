package algorithm.string

class LeetCode820 {
    /**
     * ["p","grah","qwosp"]
     * expected : 11
     * 왜 ???
     */
    fun minimumLengthEncoding(words: Array<String>): Int {
        var sharp = 1
        var result: String = words[0]
        words.drop(1).forEach {
            val long: String = if (result.length < it.length) it else result
            val short: String = if (result.length < it.length) result else it

            if (long.substring(0, short.length) != short && long.substring(long.length - short.length) != short) {
                result += it
                sharp++
            } else {
                if (it == long) result = it
            }

        }
        return result.length + sharp
    }
}