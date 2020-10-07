package algorithm.greedy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/non-overlapping-intervals/
 * <p>
 * 2차원 배열의 간격값들이 주어진다.
 * 각 간격들이 겹치지 않도록 만들려면, 몇개의 간격을 지워야 할까?
 */
public class LeetCode435 {
    /*
    //종료지점을 기준으로 정렬함.
    //2 ms	38.9 MB
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals, ((o1, o2) -> o1[1] - o2[1]));
        int count = 0;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (end > intervals[i][0]) {
                count++;
            } else {
                end = intervals[i][1];
            }
        }
        return count;
    }
    */
/*
    //시작지점을 기준으로 정렬함. 때문에 새로운 시작지점과, 이전 종료지점을 비교한 후, 종료지점을 한번 더 비교해줘야함.
    //1 ms	38.9 MB
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        });

        int count = 0;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int newEnd = intervals[i][1];
            if (end > intervals[i][0]) {
//                if (end > newEnd) {
//                    end = newEnd;
//                }
                //[1,4], [2,3], [3,4], [4,5]

                //[2,3],[1,4],[3,4],[4,5]
                end = Math.min(end,newEnd);
                count++;

            } else {
                end = newEnd;
            }
        }
        return count;
    }
    */

    public int eraseOverlapIntervals(int[][] intervals) {
        final int LEN = intervals.length;
        if (LEN == 0) return 0;
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        });

        int count = 1;
        int end = intervals[0][1];

        for (int i = 1; i < LEN; i++) {
            if ( intervals[i][0] >= end) {
                count++;
                end = intervals[i][1];
            }
        }
        return LEN-count;
    }
}
