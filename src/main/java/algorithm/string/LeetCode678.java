package algorithm.string;

import java.util.ArrayDeque;
import java.util.Stack;

//https://leetcode.com/problems/valid-parenthesis-string/
public class LeetCode678 {
//1 ms	36.6 MB
    public boolean checkValidStringStack(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '*':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    } else {
                        Stack<Character> temp = new Stack<>();
                        while (!stack.isEmpty()) {
                            char left = stack.pop();
                            if (left == '*') {
                                temp.push(left);
                            } else {
                                stack.addAll(temp);
                                break;
                            }
                        }
                    }
                    break;
            }
        }

        int right = 0;
        while (!stack.isEmpty() && right >= 0) {
            switch (stack.pop()) {
                case '*':
                case ')':
                    right++;
                    break;
                default:
                    right--;
                    break;
            }
        }
        return right >= 0;
    }

    //SOLUTION using Two Stacks
    //0 ms	37 MB
    //stack에 인덱스를 넣음
    public boolean checkValidStringSolution(String s) {
        Stack<Integer> leftID = new Stack<>();
        Stack<Integer> starID = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                leftID.push(i);
            else if (ch == '*')
                starID.push(i);
            else {
                if (leftID.isEmpty() && starID.isEmpty())   return false;
                if (!leftID.isEmpty())
                    leftID.pop();
                else
                    starID.pop();
            }
        }
        //인덱스 값으로 순서를 비교해 valid 체크
        while (!leftID.isEmpty() && !starID.isEmpty()) {
            if (leftID.pop() > starID.pop())
                return false;
        }
        return leftID.isEmpty();
    }


    //Wrong Answer
    //*, ( 만 남았을때 valid체크를 못함.
    public boolean checkValidStringFail(String s) {
        int left = 0;
        int star = 0;

        boolean isValid = true;

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    left++;
                    isValid=false;
                    break;
                case ')':
                    if (left > 0) {
                        left--;
                        isValid=true;
                    } else if (star > 0) {
                        star--;
                    } else {
                        return false;
                    }
                    break;
                case '*':
                    star++;
                    break;
            }
        }

        return isValid &&( left == 0 || left <= star );
    }

    //solution
    public boolean checkValidString(String s) {
        //0 ms	36.8 MB
        int cmin = 0, cmax = 0; // open parentheses count in range [cmin, cmax]
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cmax++;
                cmin++;
            } else if (c == ')') {
                cmax--;
                cmin--;
            } else if (c == '*') {
                cmax++; // if `*` become `(` then openCount++
                cmin--; // if `*` become `)` then openCount--
                // if `*` become `` then nothing happens
                // So openCount will be in new range [cmin-1, cmax+1]
            }
            if (cmax < 0) return false; // Currently, don't have enough open parentheses to match close parentheses-> Invalid
            // For example: ())(
            cmin = Math.max(cmin, 0);   // It's invalid if open parentheses count < 0 that's why cmin can't be negative
        }
        return cmin == 0; // Return true if can found `openCount == 0` in range [cmin, cmax]

        /*
        //0 ms	36.5 MB
          int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                low++;
                high++;
            } else if (s.charAt(i) == ')') {
                if (low > 0) {
                    low--;
                }
                high--;
            } else {
                if (low > 0) {
                    low--;
                }
                high++;
            }
            if (high < 0) {
                return false;
            }
        }
        return low == 0;
         */
    }
}
