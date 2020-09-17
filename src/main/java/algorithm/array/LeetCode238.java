package algorithm.array;

import java.util.Arrays;

public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        final int LEN = nums.length;
        int[] answer = new int[LEN];

//        answer[0] = 1;
//        for (int i = 1; i < LEN; i++) {
//                answer[i] = answer[i-1] * nums[i-1];
//        }

        Arrays.fill(answer, 1);
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }


    /**
     * Brute Force
     */
//    public int[] productExceptSelf(int[] nums) {
//        int len = nums.length;
//        int[] ans = new int[len];
//
//        int result = 1;
//        for(int i = 0 ; i < len ; i++){
//            for(int j = 0 ; j < len ; j ++){
//                if(i!=j){
//                    result *= nums[j];
//                }
//            }
//            ans[i] = result;
//            result = 1;
//        }
//
//        return ans;
//    }
}
