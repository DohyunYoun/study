package algorithm;

import java.util.Arrays;

/**
 * A city와 B city를 가는 인원은 동일하다.
 */
public class LeetCode1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(o1,o2)->{
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        int cost  = 0;
        for (int i = 0, len = costs.length; i < len; i++) {
            cost += Math.min(costs[i][0],costs[i][1]);
        }
        return cost;
    }

}
