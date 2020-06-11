import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArray350{
    public static void main(final String[] args) {
        System.out.println("Default Main Fuction Sample");
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        intersect(a,b);
    }
    
    public static int[] intersect(final int[] nums1, final int[] nums2) {
        
        int[] ss ;
        int[] ll;
        
        // ArrayList<Integer> result = new ArrayList<>();
        // >upgrade
        int k = 0;
        
        if(nums1.length > nums2.length){
            ss = nums2;
            ll = nums1;
        }else{
            ss = nums1;
            ll = nums2;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < ll.length ; i++){
            map.put(ll[i], map.getOrDefault(ll[i], 0)+1);
        }
        
        for(int i = 0 ; i < ss.length ; i++){
            if(map.containsKey(ss[i]) && map.get(ss[i])>0){
                ll[k] = ss[i];
                k++;
                map.put(ss[i], map.get(ss[i])-1);
            }
        }
        
        
        // int[] arr = new int[result.size()];
        // for(int i = 0 ; i<result.size() ; i++){
            //     arr[i] = result.get(i);
            // }
            // return arr;
            //>Upgrade
            return Arrays.copyOfRange(ll, 0, k);
            
            
            //USING Array
            //     if(nums1.length==0)
            //     return nums1;
            // if(nums2.length==0)
            //     return nums2;
            // Arrays.sort(nums1);
            // Arrays.sort(nums2);
            // int i=0,j=0,k=0;
            // while(i<nums1.length && j<nums2.length){
                //     if(nums1[i]<nums2[j] )
                //         i++;
                //     else if(nums2[j]<nums1[i])
                //         j++;
                //     else if(nums1[i]==nums2[j]){
                    //         nums1[k++]=nums1[i];
                    //         i++;            
                    //         j++;
                    //     }
                    // }
                    // return Arrays.copyOfRange(nums1, 0, k);
                }
            }
            