package algorithm.search;

import java.util.*;

//Time Limit
public class Leetcode1649 {
    public int createSortedArray(int[] instructions) {
        List<Integer> sorted = new LinkedList<>();
        sorted.add(instructions[0]);
        sorted.add(instructions[1]);

        int cost = 0;

        for (int i = 2; i < instructions.length; i++) {
            int num = instructions[i];
            int smaller = 0;
            int bigger = 0;

            int inputIdx = 0;

//            while(smaller <= bigger){
//
//            }
            for (int j = 0; j < sorted.size(); j++) {
                if (sorted.get(j) < num) {
                    smaller++;
                    inputIdx++;
                } else if (sorted.get(j) > num) {
                    bigger++;
                }else{
                    continue;
                }
            }
            sorted.add(inputIdx,num);
            cost+=Math.min(smaller,bigger);
        }
        return cost;
    }
}
