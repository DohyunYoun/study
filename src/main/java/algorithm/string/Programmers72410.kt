package algorithm.string


class Programmers72410 {
    /**
     * 조금 더 코틀린 스럽게 ?
     */
    fun solution(new_id: String): String {
        return new_id
                .step1()
                .step2()
                .step3()
                .step4()
                .step5()
                .step6()
                .step7()
    }

    private fun String.step1() = this.toLowerCase()
    private fun String.step2() = this.filter { it.isLetter() || it.isDigit() || it == '-' || it == '_' || it == '.' }
    private fun String.step3() = this.replace("\\.+".toRegex(), ".")
    private fun String.step4() = this.removePrefix(".").removeSuffix(".")
    private fun String.step5() = if (this.isBlank()) "a" else this
    private fun String.step6() = if (this.length >= 16) this.substring(0 until 15).removeSuffix(".") else this
    private fun String.step7() = if (this.length <= 2) this + this.last().toString().repeat(3 - this.length) else this

    //더 오래걸림
//    private fun String.step3(): String {
//        var text = this
//        while (text.contains(".."))
//            text = text.replace("..", ".")
//        return text
//    }

    /**
     * 정규식, 1차 코드
     */
//    fun solution(new_id: String): String {
//        return step7(step6(step5(step4(step3(step2(step1(new_id)))))))
//    }
//
//    fun step1(input: String): String = input.toLowerCase()
//    fun step2(input: String): String = input.replace("[^-_[.][a-z][0-9]]".toRegex(), "")
//    fun step3(input: String): String = input.replace("\\.+".toRegex(), ".")
//    fun step4(input: String): String {
////        input.replace("^\\.|\\.$".toRegex(), "")
//        var text = input
//        if (text.isNotBlank() && text.first() == '.')
//            text = text.removeRange(0, 1)
//        if (text.isNotBlank() && text.last() == '.') {
//            text = text.removeRange(text.length - 1, text.length)
//        }
//        return text
//    }
//
//    fun step5(input: String): String = if (input.isBlank()) "a" else input
//    fun step6(input: String): String = if (input.length >= 16) step4(input.substring(0, 15)) else input
//    fun step7(input: String): String {
//        return if (input.length <= 2) {
//            var text = input
//            while (text.length != 3) {
//                text += text.last()
//            }
//            text
//        } else input
//    }
}