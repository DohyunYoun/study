import static org.junit.Assert.*;
import org.junit.Test;
public class IntersectionOfTwoArray350Test {
    @Test
    public void test() {
        IntersectionOfTwoArray350 aa = new IntersectionOfTwoArray350();
        
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        
        int[] acture=aa.intersect(a, b);
        int[] expected = new int[]{2,2};
        
        assertArrayEquals(acture,expected);
        // assertEquals(true,false);
        
    }
}
