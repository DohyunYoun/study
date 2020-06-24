package algorithm.binarySerach;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by DohyunYoun on 2020-06-11
 * SITE :
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj2869Test {
    private Boj2869 problem;

    int a;
    int b;
    int v;

    @Before
    public void input() throws IOException {
        problem = new Boj2869();

    }

    @Test
    public void testA(){
        //given
        a = 2;
        b=1;
        v=5;
        //when
        int expected = 4;
        int acture =   problem.solve(a,b,v);
        //then
        assertEquals(expected,acture);
    }


}