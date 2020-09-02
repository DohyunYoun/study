package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Programmers42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int count = 1;
        int before = (int) Math.ceil((double) (100 - progresses[0]) / speeds[0]);
        for (int i = 1, len = progresses.length; i < len; i++) {
            int after = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            if (before >= after) {
                count++;
                continue;
            }
            answer.add(count);
            before = after;
            count = 1;
        }
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
