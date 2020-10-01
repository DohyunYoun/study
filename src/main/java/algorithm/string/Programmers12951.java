package algorithm.string;

import java.util.StringTokenizer;

public class Programmers12951 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char before = s.charAt(0);
        if (Character.isLetter(before)) {
            sb.append(Character.toUpperCase(before));
        } else {
            sb.append(before);
        }

        for (int i = 1, len = s.length(); i < len; i++) {
            char letter = s.charAt(i);
            if (!Character.isLetter(letter)) {
                sb.append(letter);
                before = letter;
                continue;
            }
            if (Character.isWhitespace(before)) {
                sb.append(Character.toUpperCase(letter));
            } else {
                sb.append(Character.toLowerCase(letter));
            }
            before = letter;
        }

        return sb.toString();
    }
    public String solution2(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        s = s.toLowerCase();
        boolean isFront = true;
        for (char ch : s.toCharArray()) {
            ch = isFront ? Character.toUpperCase(ch) : ch;
            isFront = ch == ' ';
            sb.append(ch);
        }
        return sb.toString();
    }
}
