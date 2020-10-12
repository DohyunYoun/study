package algorithm.array;

import java.util.HashMap;

public class Leetcode287 {
    // 공간복잡도 O(1)
    // 시간복잡도 O(n^2)
    // assume the array is read only
    public int findDuplicate(int[] nums) {
        /**
         * Time Complexity : O(n)
         * Space Complexity : O(n)
         *
         * Do HashSet
         */
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0, len = nums.length; i < len; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], false);
            }
        }
        return 0;
    }

    public int findDuplicateSolution1(int[] nums) {
        /**
         * Time Complexity : O(n)
         * Space Complexity : O(1)
         *
         */
        if (nums.length == 0)
            return 0;
        int slow = 0, fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }

    public int findDuplicateSolution2(int[] nums) {
        /**
         * Time Complexity : O(n)
         * Space Complexity : O(1)
         *
         */

        //SOLUTION 2
        int a = 0, b = 0;
        do {
            a = nums[nums[a]];
            b = nums[b];
        } while (a != b);
        b = 0;

        while (a != b) {
            a = nums[a];
            b = nums[b];
        }
        return a;
    }

    int memorize(int[] nums){
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
