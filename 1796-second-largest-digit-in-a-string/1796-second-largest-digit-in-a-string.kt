class Solution {
    fun secondHighest(s: String): Int {
       return s.mapNotNull { if(it.isDigit()) Character.getNumericValue(it) else null }.distinct().sortedDescending().getOrElse(1){-1}
//       return s.mapNotNull { if(it.isDigit()) it.digitToInt() else null }.distinct().sortedDescending().getOrElse(1){-1} 
    }
}