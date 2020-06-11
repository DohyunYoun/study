import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//136
public class SingleNumber{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    public static int singleNumber(int[] nums) {
        //10ms, 42.3mb
        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> result = new ArrayList<>();
        // for(int i : nums){
        //     map.put(i,(map.getOrDefault(i, 0)+1)%2);
        //     if(map.get(i)%2!=0){
        //         result.add(i);
        //     }
        // }
        
        // for(int i = 0 ; i<result.size();i++){
        //     if(map.get(result.get(i))%2 !=0){
        //         return result.get(i);
        //     }
        // }
        // return 0;

        //7ms, 42.4mb
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int i : nums){
            if(map.get(i)%2!=0){
                return i;
            }
        } 
        return 0;

        //2. XOR
        //3. vlaue값을 더해서, 중복제거해서 처리??
        // def singleNumber(self, nums):
        // “”"
        // :type nums: List[int]
        // :rtype: int
        // return 2 * sum(set(nums)) - sum(nums)
        //4. hashmap에서 첫번째 키로 값을 가져오는게 가능한가? 아니면 가능한 자료형은?
    }
}
