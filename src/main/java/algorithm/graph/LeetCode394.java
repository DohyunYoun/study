package algorithm.graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeetCode394 {
    public String decodeString(String s) {
        Queue<Character> queue = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
        }
        return decode(queue);
    }

    static String decode(Queue<Character> queue) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (!queue.isEmpty()) {
            char c = queue.poll();
            if (Character.isDigit(c)) {
                //2자리수 일수도 있어서
                num = num * 10 + c - '0';
            } else if (c == '[') {
                String sub = decode(queue);
                //repeat num
                for (int i = 0; i < num; i++) {
                    sb.append(sub);
                }
                num = 0;
            } else if (c == ']') {
                break;
            } else {
                //is alphabet
                sb.append(c);
            }
        }//end while
        return sb.toString();
    }
}
