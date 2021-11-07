package algorithm.implementation

class LeetCode1736 {
    fun maximumTime(time: String): String {
        val HIDDEN = '?'

        var hour1 = time[0]
        var hour2 = time[1]
        val min1 = if (time[3] == HIDDEN) '5' else time[3]
        val min2 = if (time[4] == HIDDEN) '9' else time[4]

        if (hour1 == HIDDEN) {
            if (hour2 == '?') {
                hour1 = '2'
                hour2 = '3'
            } else {
                hour1 = if (hour2 >= '4') '1' else '2'
            }
        } else {
            if (hour2 == HIDDEN) {
                hour2 = if (hour1 == '2') '3' else '9'
            }
        }
        return "$hour1$hour2:$min1$min2"
    }
}