package algorithm.implementation


class LeetCode645 {
    fun findErrorNums(nums: IntArray): IntArray {

        val correctNums = IntArray(nums.size){it+1}
        var result = mutableListOf<Int>()

        nums.forEachIndexed { i, n ->
            if(n != correctNums[i]){
                result.add(n)
            }
        }
        return result.toIntArray()

    }
}