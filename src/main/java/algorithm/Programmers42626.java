package algorithm;

import java.util.PriorityQueue;

/**
 * Created by DohyunYoun on 2020-06-11
 * SITE :
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Programmers42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.offer(i);
        }

        int p = 0; //index
        int min = 0; //firstMild

        while (p != scoville.length) {
            min = queue.poll();
            int minS = 0; // secondMild
            if (!queue.isEmpty()) {
                minS = queue.poll();
            } else {
                break;
            }


            if (min >= K) {
                break;
            } else {
                minS = min + (minS * 2);
                queue.offer(minS);
                answer++;
            }
            p++;
        }

        if (min < K) {
            answer = -1;
        }

        return answer;
    }

}
