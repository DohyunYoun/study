package algorithm.structure;

import java.util.*;

public class Programmers42578 {

    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            List<String> list = map.getOrDefault(category, new ArrayList<>());
            list.add(clothes[i][0]);
            map.put(category, list);
            answer++;
        }
        if (map.size() > 1) {
            int count = 1;

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                count *= entry.getValue().size();
            }
            answer += count;
        }
        return answer;
    }

    public int solution2(String[][] clothes) {
        HashMap<String, Integer> category = new HashMap<>();

        int cat = 0;
        int clo = clothes.length;

        int cloValue = 1;
        int catValue = 1;

        for (int i = 0; i < clothes.length; i++) {
            for (int j = 0; j < clothes[i].length; j++) {
                category.put(clothes[i][j], 1);
            }
        }
        cat = category.size() - clo;

        //(clo! / cat!) + cat!
        //if cat == 1 { clo!/cat! }
        for (int i = clo; i > 0; i--) {
            cloValue *= i;
        }

        for (int i = cat; i > 0; i--) {
            catValue *= i;
        }

        if (cat == 1) {
            return cloValue / catValue - clo;
        } else {
            return (cloValue / catValue) + catValue;
        }
    }
}
