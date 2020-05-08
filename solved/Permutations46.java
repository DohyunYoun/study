import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }

    //1 ms	40.5 MB
    public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums.length == 0) {
			return result;
		}

		collectPermutations(nums, 0, new ArrayList<>(), result);
		return result;
    }

	private void collectPermutations(int[] nums, int start, List<Integer> tmp,
 			List<List<Integer>>  result) {
		
		if (tmp.size() == nums.length) {
			result.add(tmp);
			return;
		}

		for (int i = 0; i <= tmp.size(); i++) {
			List<Integer> newPermutation = new ArrayList<>(tmp);
			newPermutation.add(i, nums[start]);
			collectPermutations(nums, start + 1, newPermutation, result);
		}
    }


    /*
    //	1 ms	39.7 MB
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> element = new ArrayList<Integer>();
    generate(result, element, nums, 0);
    return result;
}

private void generate(List<List<Integer>> result, List<Integer> element, int[] nums, int n){
    if(n==nums.length){
        result.add(element);
        return;
    }

    int size = element.size();
    for(int i = 0; i <= size; i++){
        List<Integer> temp = new ArrayList<Integer>(element); 
        temp.add(i,nums[n]);
        generate(result, temp, nums, n+1);
    }
    return;
}
*/

/*\
//2 ms	39.5 MB
public List<List<Integer>> permute(int[] nums) {
   List<List<Integer>> list = new ArrayList<>();
   // Arrays.sort(nums); // not necessary
   backtrack(list, new ArrayList<>(), nums);
   return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
   if(tempList.size() == nums.length){
      list.add(new ArrayList<>(tempList));
   } else{
      for(int i = 0; i < nums.length; i++){ 
         if(tempList.contains(nums[i])) continue; // element already exists, skip
         tempList.add(nums[i]);
         backtrack(list, tempList, nums);
         tempList.remove(tempList.size() - 1);
      }
   }
} 
*/

}
