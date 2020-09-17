package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 실패.
 * 조합을 어떻게 찾지 ..?
 */
public class Programmers42890 {
    public int solution(String[][] relation) {
        int answer = 0;
        final int CASE = relation.length;
        int candidateKey = 1;
        //save keys index from array
        //한번 후보키로 사용되면, 최소성을 만족하기 위해 이후에 키로 사용되지 않아야 한다.
        List<Integer> candidateKeys = new ArrayList<>();

        while (candidateKey <= CASE) {
            Set<String> unique = new HashSet<>();
            for(int i = 0; i < relation[0].length; i ++){
                if(candidateKeys.contains(i)){
                    continue;
                }
                for(int j = 0; j < CASE; j++){
                    String key = "";
                    for(int k = 0; k < candidateKey; k++){
                        key+=relation[j][i+k];
                    }
                    if(unique.contains(key)){
                        //후보키 탈락
                        break;
                    }else{
                        unique.add(key);
                    }
                }
                if(unique.size() == CASE){
                    candidateKeys.add(i);
                    answer++;
                }
            }
            candidateKey++;
        }
        return answer;
    }
}
