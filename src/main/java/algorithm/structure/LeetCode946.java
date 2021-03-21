package algorithm.structure;

import java.util.Stack;

public class LeetCode946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int popIndex = 0;
        for (int value : pushed) {
            stack.push(value);
            while (!stack.isEmpty() && popIndex < popped.length
                    && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty() && popIndex == popped.length;
    }
}
