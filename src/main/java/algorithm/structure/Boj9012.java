package algorithm.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj9012 {
    private final static String YES = "YES";
    private final static String NO = "NO";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            System.out.println(isVPS(br.readLine()));
        }
    }

    private static String isVPS(String s) {
        Stack<Character> validate = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case ')':
                    if (!validate.isEmpty() && validate.peek() == '(') {
                        validate.pop();
                    } else {
                        validate.push(c);
                    }
                    break;
                default:
                    validate.push(c);
                    break;
            }
        }
        return validate.isEmpty() ? YES : NO;
    }
}
