class Solution {
    fun repeatedCharacter(s: String): Char {
         val repeat = hashSetOf<Char>()
        s.forEach {
            if(repeat.contains(it)) return it
            else repeat.add(it)
        }
        return ' '
    }
}