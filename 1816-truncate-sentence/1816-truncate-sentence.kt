class Solution {
    fun truncateSentence(s: String, k: Int): String {
       return s.split(" ").take(k).joinToString(" ").trim();
//   var result = ""
//         var input= s
//         var count = k
//         while (input.isNotBlank() && count != 0) {
//             val index = input.indexOf(" ", 0)
//             if (index == -1) {
//                 result += input
//                 break
//             } else {
//                 count--
//                 result += input.substring(0, index+1)
//                 input = input.removeRange(0, index+1)
// //                input = input.substring(index+1, input.length)
//             }
//         }
//         return result.trim()
    }
}