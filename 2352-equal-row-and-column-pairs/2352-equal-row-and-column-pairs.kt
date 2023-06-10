class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        val rowStandard = grid[0]

        var pair = 0
        val size = rowStandard.size
        
        rowStandard.forEachIndexed { rowIndex, num ->
            (0 until size).forEach findNumber@{ i ->
                if (num == grid[i][0]) {
                    var count = 1


                    val row = grid[i]

                    (1 until size).forEach { j ->
                        if (row[j] == grid[j][rowIndex]) {
                            count++
                        } else {
                            return@findNumber
                        }
                    }
                    if (count == size) pair++
                    count = 1
                }
            }
        }
        return pair
    }
}