package algorithm.array;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
public class LeetCode581 {
    public static void main(String[] args) {
        int[] input = {2, 6, 4, 8, 10, 9,13,14, 15};
        System.out.println(findUnsortedSubarray(input));
    }

    static int findUnsortedSubarray(int[] nums) {
//        int[] sorted = nums.clone();
//        Arrays.sort(sorted);

        //SOLUTION 1 / 8 ms	40.9 MB
        /*
        int start = nums.length;
        int end = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            if (sorted[i] != nums[i]) {
                    start = Math.min(start,i);
                    end = Math.max(end, i);
            }
        }
*/

        //SOLUTION 2
        /*
        int start = -1;
        int end = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != sorted[i]) {
                if(start  == -1) {
                    start = i;
                }
                end = i;
            }
        }
        return (end-start <= 0)? 0 : end - start + 1;
*/

        //SOLUTION 3 / 3 ms	40.5 MB
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int startIndex = -1;
        int endIndex   = -1;

        // find endIndex
        int maxSoFar = nums[0];
        for (int i = 0; i < nums.length; i++) {
            //find wrong sorted
            if (maxSoFar > nums[i] ) {
                endIndex = i;
            }
            maxSoFar = Math.max(maxSoFar, nums[i]);
        }

        // find startIndex
        int minSoFar = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            //find wrong sorted
            if ( nums[i] > minSoFar) {
                startIndex = i;
            }
            minSoFar = Math.min(minSoFar, nums[i]);
        }

        if (startIndex == -1 || endIndex == -1) {
            return 0;
        }
        return endIndex - startIndex + 1;


//        int startIndex = -1;
//        int innermax = -1;
//        for(int i = 0 , len = nums.length ; i < len ; i ++){
//            if(i == len -1){
//                break;
//            }
//            if(startIndex<0 && nums[i] > nums[i+1]){
//                //start subarray
//                startIndex = i+1;
//            }else{
//                innermax = Math.max(innermax,nums[i]);
//            }
//        }
//
//        for(int i =  nums.length -1 ; i > 1 ; i --){
//            if(nums[i] < innermax){
//                //start subarray
//                return i - startIndex;
//            }
//        }
//        return -1;
    }
}
