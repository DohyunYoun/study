class Solution {
   fun equalPairs(grid: Array<IntArray>): Int {

        // 가로줄 시작점
        val rowStandard = grid[0]
        var pair = 0
        val size = rowStandard.size

        rowStandard.forEachIndexed { rowIndex, num ->
            (0 until size).forEach findNumber@{ index ->
                if (num == grid[index][0]) {
                    //가로
                    val row = grid[index]

                    var count = 0

                    //세로

                    (0 until size).forEach { j ->
                        if (row[j] == grid[j][rowIndex]) {
                            count++
                        } else {
                            return@findNumber
                        }
                    }
                    if (count == size) pair++
                    count = 0
                }
            }
        }
        return pair
    }
}