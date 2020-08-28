package algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56 {
    //5 ms	42.2 MB
    public int[][] merge(int[][] intervals) {
//        if (intervals.length == 0) {
//            return new int[0][0];
//        }
        if(intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, ((o1, o2) -> Integer.compare(o1[0], o2[0])));
        List<int[]> ans = new ArrayList<>();


        int[] tmp = intervals[0];
        for (int i = 1, len = intervals.length; i < len; i++) {
            if (tmp[1] >= intervals[i][0]) {
                tmp[1] = Math.max(intervals[i][1], tmp[1]);
            } else {
                ans.add(tmp);
                tmp = intervals[i];
            }
        }
        ans.add(tmp);

        return ans.toArray(new int[ans.size()][]);

    }
}
