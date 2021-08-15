package algorithm.array

class LeetCode566 {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r * c) {
            return mat
        }

        val ret = Array(r) { IntArray(c) }
        var row = 0
        var col = 0

        mat.forEach { arr ->
            arr.forEach { i ->
                if (col >= c) {
                    col = 0
                    row++
                }
                ret[row][col] = i
                col++
            }
        }
        return ret
    }
}