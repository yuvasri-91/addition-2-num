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
        assertEquals(30, result1, "10 + 20 should equal 30");
        int result2 = App.add(20,30);
        assertEquals(50, result2, "20 + 30 should equal 50");
        int result3 = App.add(number1:-5,19);
        assertEquals(14, result3, "-5 + 19 should equal 14");
        int result4 = App.add(0,number2:0);
        assertEquals(0, result3, "0 + 0 should equal 0");
    }

}