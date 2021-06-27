package algorithm.string

class LeetCode953 {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val indexed = mutableListOf<Int>()
        words.forEach {
            indexed.add(order.indexOf(it))
        }
        return indexed.equals(indexed.sort())
    }
}