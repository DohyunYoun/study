package algorithm;

import java.util.*;

public class LeetCode567 {
    String checkStr;
    public boolean checkInclusion(String s1, String s2) {
        checkStr = sortString(s1);

        for(int i = 0; i <= s2.length()-s1.length();i++){
            if(isContained( String.valueOf(s2.charAt(i)))){
                String newStr =sortString( s2.substring(i,i+s1.length()));
                if(newStr.equals(checkStr)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean isContained( String str){
        return checkStr.contains(str);
    }
    String sortString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
