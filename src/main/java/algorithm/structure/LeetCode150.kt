package algorithm.structure

import java.util.*

class LeetCode150 {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()
        tokens.forEach {
            if (it !in "+=*/") {
                stack.push(it.toInt())
            } else {
                val op1 = stack.pop().toInt()
                val op2 = stack.pop().toInt()
                val value = when (it) {
                    "+" -> op2 + op1
                    "-" -> op2 - op1
                    "*" -> op2 * op1
                    "/" -> op2 / op1
                    else -> 0
                }
                stack.push(value)
            }
        }
        return stack.pop()
    }
}