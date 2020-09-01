package algorithm.greedy;

import java.util.*;

//https://leetcode.com/problems/task-scheduler/
//solution : https://leetcode.com/problems/task-scheduler/discuss/104500/Java-O(n)-time-O(1)-space-1-pass-no-sorting-solution-with-detailed-explanation
//실패
public class LeetCode621 {
    public int leastInterval(char[] tasks, int n) {
        final Character IDLE = '0';
        final int LEN = tasks.length;

        int[] cpu = new int[26];
        for (int i = 0; i < LEN; i++) {
            int key = tasks[i]-'A';
            cpu[key]++;
        }
        Arrays.sort(cpu);
        int size = (cpu[25] *(n+1))-n;
        int space = size - cpu[25];
        for(int i = 24; i > 0; i--){
            if(cpu[i] == 0){
                break;
            }
            if(space <= 0){
                size = size + Math.abs(space);
                break;
            }
             if(cpu[i] == cpu[i+1]){
                 size++;
             }else if(cpu[i] < cpu[i+1]){
                 space-=cpu[i];
             }
        }

        return size;
    }
}
