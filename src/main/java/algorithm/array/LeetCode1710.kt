package algorithm.array

/**
 * boxTypes[numberOfBoxesi, numberOfUnitsPerBoxi]
 * 트럭에 담을 수 있는 최대 유닛의 수
 */
class LeetCode1710 {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        var space = truckSize
        var units = 0
        boxTypes.sortByDescending { it[1] }
        boxTypes.forEach {
            val count = Math.min(it[0], space)
            units += count * it[1]
            space -= count
            if (space == 0) return units
        }
        return units
    }
}

fun main() {
    val data: Array<IntArray> = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 2),
            intArrayOf(3, 1)
    )

    print(LeetCode1710().maximumUnits(data, 4))
}