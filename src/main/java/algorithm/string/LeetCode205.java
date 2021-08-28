package algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        int newCharacterS = 1;
        int newCharacterT = 1;

        for (int i = 0; i < s.length(); i++) {
            int valueS = mapS.getOrDefault(s.charAt(i), 0);
            int valueT = mapT.getOrDefault(t.charAt(i), 0);
            if (valueS == 0) {
                mapS.put(s.charAt(i), newCharacterS++);
            }
            if (valueT == 0) {
                mapT.put(t.charAt(i), newCharacterT++);
            }
            if (valueS != valueT) return false;
        }
        return true;
    }
}
