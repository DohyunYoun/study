package algorithm.array

class LeetCode665 {
    fun checkPossibility(nums: IntArray): Boolean {
        //3 4 2 3
        var errorNum = -1
        var count = 0
        nums.forEach { n ->
            if (errorNum == -1) errorNum = n
            else {
                if (errorNum > n) {
                    if (count != 0)
                        errorNum = n
                    count++

                } else {
                    errorNum = n
                }
            }
        }
        return count == 1
    }
}