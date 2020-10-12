package algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class LeetCode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nums);
        final int LEN = nums.length;
        //1 2 2 3 3 4 7 7
        //1 2 4 4 5 6 7 8
        int i = 0;
        int position = 1;
        while (position <= LEN) {
            if (i == LEN) {
                answer.add(position);
                position++;
                continue;
            }
            if (nums[i] == position) {
                i++;
                position++;
            } else {
                if (nums[i] < position) {
                    i++;
                } else {
                    answer.add(position);
                    position++;
                }
            }
        }

        return answer;
    }

    /**
     * SOLUTION
     * 해당 인덱스값을 음수로 변경하고, 이후에 양수인 값의 인덱스를 출력한다.
     */
    public List<Integer> solution(int[] nums) {

        List<Integer> ret = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
