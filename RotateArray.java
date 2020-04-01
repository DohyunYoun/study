import java.util.ArrayList;

//189
public class RotateArray{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        int[] nn = {1,2,3,4,5,6,7};
        rotate(nn,3);
    }
    
    //nums : [1,2,3,4,5]
    // k : 2
    // remain : 5-2=3
    static void rotate(int[] nums, int k) {
        // int first = 0;
        // int second = nums.length-k-1;
        // int remain = nums.length-k;
        
        // int[] tmp = new int[nums.length];
        // for(int i = 0 ; i < nums.length;i++){
            //     if(i<remain){
                //         tmp[second] = nums[i];
                //         second++;
                //     }else{
                    //         tmp[first] = nums[i];
                    //         first++;
                    //     }
                    // }
                    // nums = tmp;
                    
                    
                    while(k!=0){
                        int tmp = nums[0];
                        for(int i = 1 ; i<nums.length ; i++){
                            int temp;
                            temp = nums[i];
                            nums[i] = tmp;
                            tmp = temp;
                        }
                        nums[0]=tmp;
                        k--;
                    }
                    
                    
                    
//                     temp = nums.copy()
// lenNums=len(nums)
// for i in range(lenNums):
// index=(i+k)%lenNums
// nums[index]=temp[i]
                    
                }
                
            }
            