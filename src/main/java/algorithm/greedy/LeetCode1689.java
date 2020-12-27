package algorithm.greedy;

import java.util.Arrays;

public class LeetCode1689 {

    public int minPartitions(String n) {
        //161 ms	48.4 MB
//        String[] nums = n.split("");
//        return Arrays.stream(nums).mapToInt(Integer::parseInt).max().getAsInt();

        // 7 ms	39.1 MB
//        return n.chars().max().getAsInt();

        //3 ms	39.4 MB
        char max = n.charAt(0);
        for (char num : n.toCharArray()) {
            if (max < num) max = num;
        }
        return max - '0';
    }
}
