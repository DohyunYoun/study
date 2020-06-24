package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode347Test {
    LeetCode347 problem = new LeetCode347();

    @Test
    public void topKFrequent() {
        //given
        int[] inputArr = new int[]{1,1,1,2,2,3};
        int inputK = 1;
        //when
        int[] expected = new int[]{1};
        int[] actuarl = problem.topKFrequent(inputArr,inputK);
        //then
        assertArrayEquals(expected,actuarl);
    }
}