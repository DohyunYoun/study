import java.util.ArrayList;
import java.util.HashMap;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        
// "anagram"
// "nagaram"
isAnagram("anagram","anagrma");
    }
    static boolean isAnagram(String s, String t) {
        //My solution 15 ms	40.3 MB
        // HashMap<String, Integer> str = new HashMap<>();
        // if(s.length()!=t.length()){
        //     return false;
        // }

        // for(int i = 0 ; i <s.length() ; i++){
        //     String a = Character.toString(s.charAt(i));
        //     str.put(a,str.getOrDefault(a, 0)+1);
        // }

        // for(int i = 0 ; i < t.length() ; i++){
        //     String a = Character.toString(t.charAt(i));
        //     if(str.containsKey(a)&&str.get(a)!=0){
        //         str.put(a, str.get(a)-1);
        //     }else{
        //         return false;
        //     }
        // }
        // return true;
        

        //array Sort  2 ms	39.5 MB
        //시간복잡도 : O(n log n)
        //공간복잡도 : O(1)
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // char[] str1 = s.toCharArray();
        // char[] str2 = t.toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);
        // return Arrays.equals(str1, str2);

        //hash table 	3 ms	39.4 MB
        //시간복잡도 : O(n)
        //공간복잡도 : O(1)
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
