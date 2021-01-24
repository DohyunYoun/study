package algorithm;

/**
 * https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
 * 양옆에 숫자들을 더해서 x가 나오게 할때 몇개의 숫자를 더하는지 구하기
 */
public class LeetCode1658 {
    public int minOperations(int[] nums, int x) {
        final int LEN = nums.length;
        int operations = 0;
        int total = 0;

        for (int i = 0; i <LEN; i++) {
            total += nums[i];
            if (total == x) {
                return ++operations;
            } else if (total < x) {
                operations++;
            } else {
                total -= nums[i];
                break;
            }
        }

        for (int i = LEN-1; i >=0; i--) {
            total += nums[i];
            if (total == x) {
                return ++operations;
            } else if (total < x) {
                operations++;
            } else {
                total -= nums[i];
                return -1;
            }
        }
        return operations;
    }
}
