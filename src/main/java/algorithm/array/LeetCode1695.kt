package algorithm.array

class LeetCode1695 {
    /**
     * 겹치는 숫자가 나오면, 전체 리스트의 해당 숫자의 다음 인덱스부터 다시 더함.
     * 전체리스트는 해당 숫자의 전부분을 지워줘야함.
     */
    fun maximumUniqueSubarray(nums: IntArray): Int {
        var max = 0
        //TIME LIMIT
        var subArray = mutableListOf<Int>()
        nums.forEach {
            if (!subArray.contains(it)) {
                subArray.add(it)
            } else {
                //순서주의 : 이전 값의 sum을 먼저 저장하고
                //이후에 다음 계산을 위해 subArray에 현재값을 넣는다.
                val sum = subArray.sum()
                subArray.add(it)
                max = Math.max(max, sum)

                val startIndex = subArray.indexOf(it) + 1
                subArray = subArray.subList(startIndex, subArray.size)
            }
        }
        return Math.max(max, subArray.sum())

//        val represent = IntArray(100001)
//        var startIndex = 0
//        val list = nums.asList()
//        list.forEachIndexed { index, n ->
//            if (represent[n] == 0 && startIndex > index) {
//                represent[n] = index
//                max += n
//            } else {
//                max = Math.max(max, list.subList(startIndex, represent[n]).sum())
//                startIndex = represent[n] + 1
//                represent[n] = index
//            }
//        }
//        return Math.max(max, list.subList(startIndex, list.size).sum())

    }
}

fun main() {
    println(LeetCode1695().maximumUniqueSubarray(intArrayOf(5, 2, 1, 2, 5, 2, 1, 2, 5)))
    println(LeetCode1695().maximumUniqueSubarray(intArrayOf(4, 2, 4, 4, 5, 6)))
    println(LeetCode1695().maximumUniqueSubarray(intArrayOf(4, 2, 4, 5, 6)))
}