package algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Programmers68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
//        Arrays.sort(numbers);
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i+1; j < numbers.length; j++){
                answer.add(numbers[i]+numbers[j]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
