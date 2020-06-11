import org.junit.Test;
import static org.junit.Assert.assertEquals;
//https://gurumee92.tistory.com/162
    
public class ProgrammersMakeBigNumberTest {
    ProgrammersMakeBigNumber q = new ProgrammersMakeBigNumber();
        
    @Test
    public void testA() {
        
        String number = "1924";
        int k = 2;


        String expected = "94";
        String actual = q.solve(number,k);
        assertEquals(expected, actual);
    }

         
    @Test
    public void testB() {
        
        String number = "1231234";
        int k = 3;


        String expected = "3234";
        String actual = q.solve(number,k);
        assertEquals(expected, actual);
    }
         
    @Test
    public void testC() {
        
        String number = "4177252841";
        int k = 4;


        String expected = "775841";
        String actual = q.solve(number,k);
        assertEquals(expected, actual);
    }
         
}
    