package algorithm.bst;

import algorithm.graph.ProgrammersTravelPath;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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

        //when
        int expected = 4;
        int acture =   problem.solve(a,b,v);
        //then
        assertEquals(expected,acture);
    }


}