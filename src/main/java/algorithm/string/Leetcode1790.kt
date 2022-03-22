class Leetcode1790 {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
   var firstIndex = -1
        var isEqual = false
        s1.forEachIndexed { index, c ->
            if(c != s2[index]){
                if(firstIndex == -1) firstIndex = index
                else{
                    if(isEqual) return false
                    if(s2[index] == s1[firstIndex] && s2[firstIndex] == s1[index]){
                        isEqual = true
                    }else{
                        return false
                    }
                }
            }
        }
        return s1 == s2 || isEqual    }
}
