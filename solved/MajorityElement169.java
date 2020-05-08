import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement169{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        int[] n = {5,2,5,3,5};
        majorityElement(n);
    }

    static int majorityElement(int[] nums) {
      
        Arrays.sort(nums);

        int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            //중복되는 갯수만큼 줄어들며, 다음 숫자가 더 많으면 그 숫자로 변경된다.
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;
            
        }
        return major;

/*
        Arrays.sort(nums);
	  int len = nums.length;
      return nums[len/2];
      */

        // Arrays.sort(nums);
        // int before = 1;
        // int after = 1;
        // int e = nums[0];
        // for(int i = 1 ; i < nums.length ; i++){
        //     if(nums[i-1]==nums[i]){
        //         after++;
        //     }else{
        //         if(before<after){
        //             before = after;
        //         }
        //         e=nums[i];
        //         after = 0;
        //     }
        // }

        // return e;
    }
}
