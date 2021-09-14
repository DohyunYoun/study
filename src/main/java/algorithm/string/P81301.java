package algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class P81301 {
    public static int solution(String input) {
        Map<String, String> map = new HashMap<>();
        map.put("ze", "0");
        map.put("on", "1");
        map.put("tw", "2");
        map.put("th", "3");
        map.put("fo", "4");
        map.put("fi", "5");
        map.put("si", "6");
        map.put("se", "7");
        map.put("ei", "8");
        map.put("ni", "9");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (i + 2 > input.length()) break;
                sb.append(map.getOrDefault(input.substring(i, i + 2), ""));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
