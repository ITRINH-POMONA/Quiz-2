import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testSum(){
        int expected = 3;
        int actual = calc.sum(1, 2);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtraction(){
        int expected = 1;
        int actual = calc.subtract(2, 1);
        assertEquals(expected, actual);
    }
    @Test
    public void testMultiply(){
        int expected = 4;
        int actual = calc.multiply(2, 2);
        assertEquals(expected, actual);
    }
}
