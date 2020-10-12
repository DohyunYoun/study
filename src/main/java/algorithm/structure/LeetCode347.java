package algorithm.structure;

import java.util.*;
import java.util.stream.Collectors;
//https://leetcode.com/problems/top-k-frequent-elements/
public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, len = nums.length; i < len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> arr = new PriorityQueue<>((left, right) ->
                right.getValue().compareTo(left.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr.offer(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.poll().getKey();
        }
        return result;

    }
}
