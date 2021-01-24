package algorithm.greedy;

import java.util.Arrays;

public class LeetCode881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) left++;

            right--;
            boats++;
        }


//        int weights = 0;
//
//        for (int i = people.length - 1; i >= 0; i--) {
//            weights += people[i];
//            if (weights <= limit) {
//                continue;
//            }
//            boats++;
//            weights = people[i];
//        }
//        if (weights != 0) boats++;
        return boats;
    }
}
