package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode11Test {
    LeetCode11 problem = new LeetCode11();

    @Test
    public void maxArea() {
        //given
        int[] input = {1,8,6,2,5,4,8,3,7};
        //when
        int expected = 49;
        int actual = problem.maxArea(input);
        //then
        assertEquals(expected,actual);
    }
}