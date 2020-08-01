package algorithm.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        List<HashMap<Character, List<String>>> anagrams = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        List<String> a = new ArrayList<>();
        result.add(a);
        result.get(0).add(strs[0]);
        boolean isAdded = false;
        for (int i = 1; i < strs.length; i++) {
            String[] tmp = strs[i].split("");
            Arrays.sort(tmp);
            isAdded = false;
            for(int j = 0; j < result.size(); j++){
                String[] inner = result.get(j).get(0).split("");
                Arrays.sort(inner);
                if((String.join("",inner)).equals( String.join("",tmp))){
                    result.get(j).add(strs[i]);
                    isAdded = true;
                }
            }
            if(!isAdded){
                List<String> b = new ArrayList<>();
                b.add(strs[i]);
                result.add(b);
            }
        }
        return result;
    }
}
