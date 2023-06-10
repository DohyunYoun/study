class Solution {
    fun repeatedCharacter(s: String): Char {
         val repeat = arrayListOf<Char>()
        s.forEach {
            if(repeat.contains(it)) return it
            else repeat.add(it)
        }
        return ' '
    }
}