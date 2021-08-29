package algorithm.array;

import java.util.*;

public class LeetCode378 {
    public int kthSmallest(int[][] matrix, int k) {

        //정렬되서 안들어감?? 왜?
//        PriorityQueue<Integer> box = new PriorityQueue<>();
        List<Integer> box = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int i : ints) {
                box.add(i);
            }
        }
        Collections.sort(box);
        return box.get(k - 1);
//        return (int) box.toArray()[k-1];
    }
}
