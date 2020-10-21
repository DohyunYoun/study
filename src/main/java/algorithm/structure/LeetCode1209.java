package algorithm.structure;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by DohyunYoun on 2020-10-21
 * SITE : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class LeetCode1209 {
    Stack<Character> answer = new Stack<>();
    int k;

    //time limit
    public String removeDuplicates(String s, int k) {
        this.k = k;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer.push(c);
            remove();
        }
        return answer.stream().map(Object::toString).collect(Collectors.joining());
    }

    void remove() {
        int i = 1;
        char before = answer.pop();
        while (k != i) {
            if (answer.isEmpty()) {
                while (i != 0) {
                    answer.push(before);
                    i--;
                }
                return;
            }
            char after = answer.pop();
            if (before != after) {
                answer.push(after);
                while (i != 0) {
                    answer.push(before);
                    i--;
                }
                return;
            }
            i++;
        }
        if (!answer.isEmpty())
            remove();
    }
    //two pointer
    //3 ms	39 MB
    public String removeDuplicatesSOLUTION(String s, int k) {
        int i = 0, n = s.length(), count[] = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) i -= k;
        }
        return new String(stack, 0, i);
    }
}
