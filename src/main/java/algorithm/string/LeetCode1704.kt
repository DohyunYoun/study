package algorithm.string

class LeetCode1704 {
    fun halvesAreAlike(s: String): Boolean {
        val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val left = s.substring(0, s.length / 2).groupingBy { it }.eachCount()
        val right = s.substring(s.length / 2).groupingBy { it }.eachCount()

        var leftCount = 0
        var rightCount = 0

        vowels.forEach {
            leftCount += left.getOrDefault(it, 0)
            rightCount += right.getOrDefault(it, 0)
        }

        return leftCount == rightCount
    }

    fun halvesAreAlike2(s: String): Boolean {
        val c: CharArray = s.toLowerCase().toCharArray()
        var left = 0
        var right = c.size - 1
        var leftCount = 0
        var rightCount = 0
        while (left < right) {
            if (isVowels(c[left++])) leftCount++
            if (isVowels(c[right--])) rightCount++
        }
        return leftCount == rightCount
    }

    fun isVowels(c: Char): Boolean {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
    }
}
}