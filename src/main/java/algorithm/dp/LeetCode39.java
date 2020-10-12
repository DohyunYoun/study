package algorithm.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class LeetCode39{
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        Arrays.sort(nums);
        
        backtrack(list,tmpList, nums, target, 0);
        return list;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tmpList, int [] candidates, int target, int start){
        if(target < 0) return;
        else if(target == 0) result.add(new ArrayList<>(tmpList));
        else{ 
            for(int i = start; i < candidates.length; i++){
                tmpList.add(candidates[i]);
                backtrack(result, tmpList, candidates, target - candidates[i], i); // not i + 1 because we can reuse same elements
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
    
    // public static void main(String[] args) {
    //     int[] input = {2,3,6,7};
    //     combinationSum2(input,7);
        
    // }
    
    public   List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        find(result,stack,candidates,target,0);
        return result;
    }
    private void find(List<List<Integer>> result, Stack<Integer> stack,int[] candidates, int target, int start ) {
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] == target) {
                stack.push(candidates[i]);
                result.add(new ArrayList<>(stack));
                stack.pop();
            } else if (candidates[i] < target) {
                stack.push(candidates[i]);
                find(result, stack, candidates, target - candidates[i], i);
                stack.pop();
            }
        }
    }
}