package algorithm.array

/*
1) 주어진 배열 범위에서 가운데값을 찾고, 그 값이 peak element인지 검사
2) peak element라면 가운데 인덱스를 리턴
3) peak element가 아니라면 이전값, 다음값 중에서 가운데값보다 큰 값인 곳으로 배열의 범위를 이동
이전값이 가운데값보다 크다면 배열의 범위를 0 ~ half로 이동
다음값이 가운데값보다 크다면 배열의 범위를 half ~ size로 이동
peak element를 찾거나 이동할 배열 범위가 있을 때까지 1)의 내용부터 계속 반복
 */
class LeetCode162 {
    fun findPeakElement(nums: IntArray, left: Int, right: Int): Int {
        var size = nums.size
        var half = nums.size / 2
        while (half > 0) {
            val halfValue = nums[half]
            val prevValue = nums.getOrNull(half - 1) ?: Int.MIN_VALUE
            val nextValue = nums.getOrNull(half + 1) ?: Int.MIN_VALUE

            if (halfValue > prevValue && halfValue > nextValue) {
                return half
            } else {
                if (prevValue > halfValue) {
                    size = half
                    half = (0 + half) / 2
                } else {
                    half = (half + size) / 2
                }
            }
        }

        return half
    }
}