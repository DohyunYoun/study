package algorithm.string

class LeetCode916 {
    fun wordSubsets(A: Array<String>, B: Array<String>): List<String> {
        val SUBSET_SIZE = B.size
        val result = mutableListOf<String>()

        val subset = B.joinToString().toList().sorted().toString()

        A.forEach { a ->
            var isSubset = 0
            B.forEach { b ->
                if (a.contains(b)) isSubset++
            }
            if (isSubset == SUBSET_SIZE) result.add(a)
        }
        return result
    }
}