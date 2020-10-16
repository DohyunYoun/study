package algorithm.structure;

import java.util.ArrayList;
import java.util.List;

public class Programmers42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int jobCount = 0;
        int duration = 0;
        for (int i = 0; i < progresses.length; i++) {
            int leftJobs = (int) Math.ceil((100 - progresses[i]) / speeds[i]);
            if (duration == 0) duration = leftJobs;
            if (duration >= leftJobs) {
                jobCount++;
            } else {
                result.add(jobCount);
                jobCount = 1;
                duration = leftJobs;
            }
        }
        if (duration != 0) result.add(jobCount);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
//    public int[] solution(int[] progresses, int[] speeds) {
//        List<Integer> answer = new ArrayList<>();
//        int count = 1;
//        int before = (int) Math.ceil((double) (100 - progresses[0]) / speeds[0]);
//        for (int i = 1, len = progresses.length; i < len; i++) {
//            int after = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
//            if (before >= after) {
//                count++;
//                continue;
//            }
//            answer.add(count);
//            before = after;
//            count = 1;
//        }
//        answer.add(count);
//        return answer.stream().mapToInt(Integer::intValue).toArray();
//    }
}
