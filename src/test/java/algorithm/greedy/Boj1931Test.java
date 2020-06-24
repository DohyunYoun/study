package algorithm.greedy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DohyunYoun on 2020-06-15
 * SITE :
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj1931Test {

    Boj1931 problem ;
    @Before
    public void setup(){
        problem = new Boj1931();
    }
    @Test
    public void assignRoomA() {
        //given
        int[][] input = new int[][] {
                {1 ,4},
                {3 ,5},
                {0 ,6},
                {5 ,7},
                {3 ,8},
                {5 ,9},
                {6 ,10},
                {8 ,11},
                {8 ,12},
                {2 ,13},
                {12, 14}};
        //when
        int expected = 4;
        int actual = problem.assignRoom(input);
        //then
        assertEquals(expected,actual);
    }

//    @Test
//    public void assignRoomB() {
//        //given
//        int[][] input = new int[][] {
//                {1, 1},
//                {1, 2},
//                {2, 2},
//                {3, 3},
//                {2, 3},
//                {4, 4}
//        };
//        //when
//        int expected = 4; //?
//        int actual = problem.assignRoom(input);
//        //then
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void assignRoomC() {
//        //given
//        int[][] input = new int[][] {
//                {1, 1},
//                {1, 2},
//                {2, 2},
//                {2, 3},
//                {3, 3},
//                {4, 4}
//        };
//        //when
//        int expected = 5; //?
//        int actual = problem.assignRoom(input);
//        //then
//        assertEquals(expected,actual);
//    }

    @Test
    public void assignRoomD() {
        //given
        int[][] input = new int[][] {
                {1, 2},
                {2, 2}
        };
        //when
        int expected = 2; //?
        int actual = problem.assignRoom(input);
        //then
        assertEquals(expected,actual);
    }
    @Test
    public void assignRoomE() {
        //given
        int[][] input = new int[][] {
                {1, 3},
                {2, 2}
        };
        //when
        int expected = 1;
        int actual = problem.assignRoom(input);
        //then
        assertEquals(expected,actual);
    }
}