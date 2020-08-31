package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Programmers67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10, right = 12;
        List<Integer> keypadM = new ArrayList<>(Arrays.asList(2, 5, 8, 11));

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n == 0) n = 11;
            switch (n) {
                case 1:
                case 4:
                case 7:
                    left = n;
                    answer.append("L");
                    break;
                case 3:
                case 6:
                case 9:
                    right = n;
                    answer.append("R");
                    break;
                default:
                    int diffL = (keypadM.contains(left)) ? Math.abs(n - left) / 3 : (Math.abs(n - (left + 1)) / 3) + 1;
                    int diffR = (keypadM.contains(right)) ? Math.abs(n - right) / 3 : (Math.abs(n - (right - 1)) / 3) + 1;

                    if (diffL == diffR) {
                        switch (hand) {
                            case "left":
                                left = n;
                                answer.append("L");
                                break;
                            case "right":
                                right = n;
                                answer.append("R");
                                break;
                        }
                    } else if (diffL < diffR) {
                        left = n;
                        answer.append("L");
                    } else {
                        right = n;
                        answer.append("R");
                    }
                    break;
            }
        }
        return answer.toString();
    }

}
