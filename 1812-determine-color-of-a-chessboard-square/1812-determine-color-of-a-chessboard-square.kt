class Solution {
    fun squareIsWhite(coordinates: String): Boolean {
        //a = 97
        return (coordinates[0].toInt().color() * coordinates[1].toInt().color()) < 0
    }

    fun Int.color() = if(this % 2 != 0) -1 else 1
}