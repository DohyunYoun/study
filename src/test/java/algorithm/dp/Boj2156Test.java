package algorithm.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Boj2156Test {
    Boj2156 problem ;
    @Before
    public void setup(){
    problem = new Boj2156();
    }
    @Test
    public void drinkWineA() {
        //given
        int[] input = new int[]{0,6,10,13,9,8,1};
        //when
        int expected = 33;
        int actual = problem.drinkWine(input);
        //then
        assertEquals(expected,actual);
    }

    @Test
    public void drinkWineB() {
        //given
        int[] input = new int[]{0,6};
        //when
        int expected = 6;
        int actual = problem.drinkWine(input);
        //then
        assertEquals(expected,actual);
    }
    @Test
    public void drinkWineC() {
        //given
        int[] input = new int[]{0,6,10};
        //when
        int expected = 16;
        int actual = problem.drinkWine(input);
        //then
        assertEquals(expected,actual);
    }
    @Test
    public void drinkWineD() {
        //given
        int[] input = new int[]{0,6,10,13};
        //when
        int expected = 23;
        int actual = problem.drinkWine(input);
        //then
        assertEquals(expected,actual);
    }
}