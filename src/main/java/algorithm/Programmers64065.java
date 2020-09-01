package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class Programmers64065 {
    public int[] solution(String s) {
        Map<Integer, Integer> tuple = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            if (c == '}' || c == ',') {
                if (sb.length() != 0) {
                    int value = Integer.parseInt(sb.toString());
                    tuple.put(value, tuple.getOrDefault(value, 0) + 1);
                    sb = new StringBuilder();
                }
            }
            if (Character.isDigit(c)) {
                sb.append(Character.getNumericValue(c));
            }
        }
        // My Solution
//        List<Map.Entry<Integer, Integer>> entries = tuple.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
//        int i = 0;
//        for (Map.Entry<Integer, Integer> entry : entries) {
//            answer[i++] = entry.getKey();
//        }
//        return answer;

        // Solution 1
        //stream 보다 runtime 굿
        final int SIZE = tuple.size();
        int[] answer = new int[SIZE];
        for (int key : tuple.keySet()) {
            answer[SIZE - tuple.get(key)] = key;
        }
        return answer;

        // Solution 2
//        return tuple.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(Map.Entry::getKey).mapToInt(x -> x).toArray();
    }

}
