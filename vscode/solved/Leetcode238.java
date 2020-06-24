import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/product-of-array-except-self/
//238. Product of Array Except Self
//Timecomplexity : 
public class Leetcode238{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        productExceptSelf(new int[]{1,2,3});
    }
    static int[] productExceptSelf(int[] nums) {
        // int len = nums.length;
        // int result = 1;

        // int[] left = new int[len];
        // left[0] = nums[0];
        // for(int i = 1 ; i < len ; i ++){
        //     left[i] = left[i-1] * nums[i];
        // }

        // int[] right = new int[len];
        // for(int i = 0 ; i < len ; i ++){

        // }
        int len = nums.length;
        int[] ans = new int[len];

        int result = 1;
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < len ; j ++){
                if(i!=j){
                    result *= nums[j];
                }
            }
            ans[i] = result;
            result = 1;
        }

        return ans;
    }
    
    
}
