import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/generate-parentheses/
//78. Subsets (Medium)
//Timecomplexity : 2^N
/**
 * Backtrack Logic
Pick a starting point.
while(Problem is not solved)
    For each path from the starting point.
        check if selected path is safe, if yes select it
        and make recursive call to rest of the problem
        before which undo the current move.
    End For
If none of the move works out, return false, NO SOLUTON.
 */
public class Leetcode78{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        subsets(new int[]{1,2,3});
    }
    //SOLUTION 2
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    
    static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    //SOLUTION 1
//   static List<List<Integer>> ans = new ArrayList<>();
//   static int len, k;

//     static List<List<Integer>> subsets(int[] nums) {
//         len   = nums.length;
//         for(k = 0 ; k < len+1 ; ++k ){
//             backtrack(0, new ArrayList<>() , nums);
//         }
//         return ans;
//     }
    
//     static void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
//         if(curr.size() == k){
//             ans.add(new ArrayList<>(curr));
//             return;
//         }
//         for(int i = first ; i < len ; ++i){
//             curr.add(nums[i]);
//             backtrack(i+1, curr, nums);
//             curr.remove(curr.size()-1);
//         }
//     }
    
}
