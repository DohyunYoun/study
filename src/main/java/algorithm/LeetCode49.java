package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode49 {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>>  ans = new ArrayList<>();
//        for(int i = 0 , len = strs.length ; i < len ; i ++){
//            for(int j = 0 , lenj = ans.size() ; i < lenj ; j++){
//                List<String> existed = ans.get(j);
//                String[] input = strs[i].split("");
//
//                Arrays.sort(existed);
//                Arrays.sort(input);
//
//                if(existed == input){
//
//                }
//
//            }
//        }
//        List<List<String>> ans = new ArrayList<>();
//        //anagrams의 i번째 리스트값이랑 일치하면 ans의 i번째 리스트에 추가한다.
//        List<HashMap<Character, Integer>> anagrams = new ArrayList<>();
//
//        for(String s : strs){
//            HashMap<Character, Integer> words = new HashMap<>();
//            if(anagrams.isEmpty()){
//                //맨 처음 시작할때 하나 넣어놓기.
//                for(int i = 0, len = s.length() ; i < len ; i++){
//                    char word = s.charAt(i);
//                    words.put(word, words.getOrDefault(word,0)+1);
//                }
//                anagrams.add(words);
//                continue;
//            }
//
//            for(int j = 0 ; j < anagrams.size() ; j ++){
//                for(int i = 0, len = s.length() ; i < len ; i++){
//                    char word = s.charAt(i);
//                    if(anagrams.get(j).containsKey())
//                    words.put(word, words.getOrDefault(word,0)+1);
//                }
//            }
//
//            if(!words.isEmpty())
//                groups.add(words);
//
//        }


//    }
}
