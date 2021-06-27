package algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
        if (digits.isBlank()) return new ArrayList<>();

        String[][] numbers = new String[11][4];
        init(numbers);

        if (digits.length() == 1)
            Arrays.asList(numbers[Integer.parseInt(digits)]);

        List<String> makingString = new ArrayList<>();

        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length() - 1; i++) {
//            if (makingString.isEmpty())
            List<String> left  = Arrays.asList(numbers[digits.charAt(i) - '0']);
            for (int j = i + 1; j < digits.length(); j++) {
                List<String> right = Arrays.asList(numbers[digits.charAt(i) - '0']);
                StringBuilder sb = new StringBuilder();
//                sb.append(l)
            }
        }
        return result;
    }

    public void init(String[][] numbers) {
        numbers[2] = new String[]{"a", "b", "c"};
        numbers[3] = new String[]{"d", "e", "f"};
        numbers[4] = new String[]{"g", "h", "i"};
        numbers[5] = new String[]{"j", "k", "l"};
        numbers[6] = new String[]{"m", "n", "o"};
        numbers[7] = new String[]{"p", "q", "r", "s"};
        numbers[8] = new String[]{"t", "u", "v"};
        numbers[9] = new String[]{"w", "x", "y", "z"};
    }
}
