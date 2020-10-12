package algorithm.implementation;

import java.util.*;

public class Programmers42889 {
    public int[] solution(int N, int[] stages) {
        final int STAGE_COUNT = N + 1;
        final int USER_COUNT = stages.length;

        int[] scores = new int[STAGE_COUNT];
        // 해당 스테이지에 도달한 유저 수를 scores에 저장한다.
        for (int stage : stages) {
            // 마지막 까지 도달한 유저는 저장할 필요가 없다.
            if (stage != STAGE_COUNT)
                scores[stage]++;
        }
        // 각 스테이지 별로 실패율을 저장한다.
        //failureRate[스테이지][실패율]
        double[][] failureRate = new double[STAGE_COUNT][2];
        int cleared = 0;
        for (int i = 1; i < STAGE_COUNT; i++) {
            failureRate[i][0] = i;
            failureRate[i][1] = (double) scores[i] / (USER_COUNT - cleared);
            //스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
            if ((USER_COUNT - cleared) == 0) {
                failureRate[i][1] = 0;
            }
            cleared += scores[i];
        }
        //array에 index 순서대로 들어가 있어서, 스테이지 별로 정렬할 필요는 없다.
        Arrays.sort(failureRate, ((o1, o2) -> Double.compare(o2[1], o1[1])));
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < STAGE_COUNT; i++) {
            //stage번호를 인덱스로 사용했기 때문에 0번째는 출력할 필요가 없다.
            if (failureRate[i][0] != 0.0)
                answer.add((int) failureRate[i][0]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
