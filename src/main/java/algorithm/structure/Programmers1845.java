package algorithm.structure;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Programmers1845 {
    public int solution(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return Math.max(set.size(), nums.length / 2);
    }
}
