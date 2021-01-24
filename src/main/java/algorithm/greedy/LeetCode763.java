package algorithm.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode763 {
    public List<Integer> partitionLabels(String S) {

        List<Integer> result = new ArrayList<>();

        StringBuilder partition = new StringBuilder();
        int duplicate = 0;
        for (char c : S.toCharArray()) {

            if(partition.indexOf(Character.toString(c)) > -1) {
                partition.append(c);
            }else{
                if(duplicate < 3){
                    partition.append(c);
                    duplicate++;

                }else{

                    result.add(partition.length());
                    partition = new StringBuilder();
                    partition.append(c);
                    duplicate = 1;
                }
            }
        }

        return result;
    }
}
