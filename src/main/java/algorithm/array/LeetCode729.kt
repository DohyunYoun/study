package algorithm.array

class LeetCode729 {
    var date = BooleanArray(1000000001) { false }

    fun book(start: Int, end: Int): Boolean {
        for(i in start..end){
            if(date[i]) return false
        }
        for(i in start..end){
            date[i]=true
        }
        return true
    }
}