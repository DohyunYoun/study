package algorithm.array

class Programmers77484 {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val winner = intArrayOf(6, 6, 5, 4, 3, 2, 1)

        val hit = lottos.intersect(win_nums.toList()).size
        val empty = lottos.count { it == 0 }
        return intArrayOf(winner[hit + empty], winner[hit])
    }
}