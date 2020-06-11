package algorithm.graph;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class ProgrammersTravelPathTest {
    private ProgrammersTravelPath problem;

    @Before
    public void setUp() {
        problem = new ProgrammersTravelPath();
    }

    @Test
    public void testA() {
        //given
        String[][] input = new String[][]{{"ICN","JFK"},{"HND","IAD"},{"JFK","HND"}};

        //when
        String[] expected	= new String[]{"ICN", "JFK", "HND", "IAD"};
        String[] actual = problem.solution(input);

        //then
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testB() {
        //given
        String[][] input = new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        //when
        String[] expected	= new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};
        String[] actual = problem.solution(input);
        //then
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testC(){
        // given
        String[][] tickets = {{"ICN", "COO"}, {"ICN", "BOO"}, {"COO", "ICN"}, {"BOO", "DOO"}};

        // when
        String[] expected = {"ICN", "COO", "ICN", "BOO", "DOO"};
        String[] actual = problem.solution(tickets);

        // then
        assertArrayEquals(expected, actual);
    }
}
