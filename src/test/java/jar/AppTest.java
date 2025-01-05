package jar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */

    @Test
    public static void testAddition() {
        int result1 = App.add(10,20);
        assertEquals(13, result1, "10 + 20 should equal 30");
        int result2 = App.add(20,30);
        assertEquals(28, result2, "20 + 30 should equal 50");
        int result3 = App.add(-5,19);
        assertEquals(14, result3, "-5 + 19 should equal 14");
    }
    
}