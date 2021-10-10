package algorithm.array;

import java.util.*;

public class Programmers68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>();
//        Set<Integer> answer = new HashSet<>();
//        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

//        int[] result = new int[answer.size()];
//        int i = 0;
//
//        for (int value : answer) {
//            result[i++] = value;
//        }
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }


}
