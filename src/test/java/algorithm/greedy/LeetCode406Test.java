package algorithm.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode406Test {

    LeetCode406 problem = new LeetCode406();
    @Test
    public void reconstructQueue() {
        int[][] input = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] expedted = new int[][]{{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
        int[][] actual = problem.reconstructQueue(input);
        assertArrayEquals(expedted,actual);
    }
}