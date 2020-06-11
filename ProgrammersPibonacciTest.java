import org.junit.Test;

import static org.junit.Assert.assertEquals;

    
public class ProgrammersPibonacciTest {
    ProgrammersPibonacci p = new ProgrammersPibonacci();
        
    @Test
    public void testA() {
        int input = 9927;
        int expected = 2;

        int actual = p.solution(input);
        
        assertEquals(expected, actual);


    }

    @Test
    public void testB() {
        int input = 5;
        int expected = 5;

        int actual = p.solution(input);
        
        assertEquals(expected, actual);

    }
}
    