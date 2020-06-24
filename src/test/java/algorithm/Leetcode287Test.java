package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode287Test {

    Leetcode287 problem = new Leetcode287();
    @Test
    public void Test() {
        int[] input = new int[]{2,2,5,3,1,4};
        int expected = 2;
        int actual = problem.memorize(input);
        assertEquals(expected,actual);
    }
}