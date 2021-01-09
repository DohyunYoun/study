package algorithm.structure;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/
public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        int count = k;
        //26 ms	47.2 MB
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0, len = nums.length; i < len; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//
//        PriorityQueue<Map.Entry<Integer, Integer>> arr = new PriorityQueue<>((left, right) ->
//                right.getValue().compareTo(left.getValue()));
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            arr.offer(entry);
//        }
//
//        int[] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = arr.poll().getKey();
//        }
//        return result;


        //21 ms	47.6 MB
        int[] result = new int[k];
        //num, count
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> (o2.getValue().compareTo(o1.getValue())));
        for(int i = 0 ; i < k; i ++){
            result[i] = entries.get(i).getKey();
        }

        //TODO
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEachOrdered(n -> {
//                    if (k < 0)
//                        return;
//                    result[k - 1] = n.getKey();
//                    k++;
//                });

        return result;
    }
}
