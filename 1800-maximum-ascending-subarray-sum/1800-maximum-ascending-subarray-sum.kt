class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
            var sum = 0
        var maxSum = 0

        nums.forEachIndexed { index, n ->
            if(index == 0){
                sum = n
                return@forEachIndexed
            }

            val prevValue = nums[index-1]
            if(prevValue < n) {
                sum+=n
            }else{
                maxSum = Math.max(sum, maxSum)
                sum = n
            }
        }
        
        return Math.max(sum, maxSum)
    }
}