class Solution {
    /**
     *  num == ints[0] 은 grid[0][0] == row[0]
     * grid[1][0] == row[1]
     * grid[2][0] == row[2]
     * grid[3][0] == row[3]
     *
     * 가로줄, 세로로 가는 기준점 : grid[0] 은 row
     * 세로줄, 가로로 가는 기준점 : grid[i][0]
     * 가로와 세로가 같으면 다음것들을 비교함
     * 다음은
     * 가로 : grid[i]의 배열
     * 세로 : grid[j][rowIndex] : 0 < j < row.size(위에서부터 내려가면서 특정위치의 값을 뽑음, rowIndex는 고정,
     */

    fun equalPairs(grid: Array<IntArray>): Int {
        // 가로줄 시작점
        val rowStandard = grid[0]

        var pair = 0
        val size = rowStandard.size

        rowStandard.forEachIndexed { rowIndex, num ->
            (0 until size).forEach findNumber@{ i ->
                //시작점이 일치할때만 비교
                if (num == grid[i][0]) {
                    var count = 1

                    //가로
                    val row = grid[i]
                    //세로탐색해서 가로의 해당 인덱스와 같은지 비교
                    //첫번째 시작점은 이미 비교했으니 1번째 부터 비교
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
