package algorithm.implementation

class LeetCode1732 {
    fun largestAltitude(gain: IntArray): Int {
        var highest = 0
        var start = 0
        gain.forEach {
            start += it
            highest = Math.max(highest, start)
        }
        return highest
    }
}