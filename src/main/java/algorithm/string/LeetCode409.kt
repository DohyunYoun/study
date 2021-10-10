package algorithm.string

class LeetCode409 {
    //"tattarrattat"
    //tttttt, aaaa, rr
    fun longestPalindrome(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        s.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        //ccc
        if(map.size == 1) return map.values.first()

        var result = 0
        //cccbbb
        map.values.forEach {
            result += if (it % 2 == 0) {
                it
            } else {
                it - 1
            }
        }

//        s.groupingBy { it }
//                .eachCount()
//                .forEach { c, count ->
//                    if(count > 1) ans += count - count % 2
//                }

        return if (result < s.length) result + 1 else result
    }
}