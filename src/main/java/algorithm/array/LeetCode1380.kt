package algorithm.array

class LeetCode1380 {
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {


        val result = mutableListOf<Int>()
        matrix.forEach { row ->
            val min = row.minOf { it }
            val index = row.indexOf(min)

            val colMax = matrix.map { it[index] }.maxOf { it }
            if (min == colMax) {
                result.add(min)
            }
        }

        return result

    }
}