package algorithm.array

class LeetCode792 {
    //3448 ms	37.4 MB
    //다른방법으로 푸는게 좋을듯.. BFS, TRIE..
    fun numMatchingSubseq(s: String, words: Array<String>): Int {
        var result = 0
        for (word in words) {
            var index = 0
            for (c in s) {
                if (index > s.length - 1) break
                if (c == word[index]) {
                    if (index == word.length - 1) {
                        result++
                        break
                    } else {
                        index++
                    }
                }
            }
        }
        return result
    }
}