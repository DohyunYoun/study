package algorithm.twopointers;

//https://leetcode.com/problems/container-with-most-water/
public class LeetCode11 {

    public int maxArea(int[] height) {
        int max = 0;
        int left = height[0];
        int right = height[1];
        for(int i = 1, len = height.length ; i < len ; i ++){
            if(left < height[i]-i){
                if((height[i] - left) < (height[i+1]-right)){

                }else{
                    left = height[i];
                    right = height[i+1];
                }

            }else{
                if(right < height[i+1]+i){
                 right = height[i+1];
                }
            }

        }
        return max;
    }

    int min(int a, int b){
        return a < b ? a : b;
    }

    int max(int a, int b){
        return a < b ? b : a;
    }
}
