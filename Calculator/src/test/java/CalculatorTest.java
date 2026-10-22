import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


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
    public void testSubtraction2(){
        int expected = -2;
        int actual = calc.subtract(2, 4);
        assertEquals(expected, actual);
    }
    @Test
    public void testMultiply(){
        int expected = 4;
        int actual = calc.multiply(2, 2);
        assertEquals(expected, actual);
    }
    @Test
    public void testMultiply2(){
        int expected = 0;
        int actual = calc.multiply(2, 0);
        assertEquals(expected, actual);
    }
    @Test
    public void testDivide(){
        int expected = 4;
        int actual = calc.divide(8, 2);
        assertEquals(expected, actual);
    }
    @Test
    public void testIsEven(){
        assertTrue(calc.isEven(2));
    }
    @Test
    public void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(2, 0));
        String expectedMessage = "Ints can NOT be divided by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testIsEven2(){
        assertFalse(calc.isEven(1));
    }
    @Test
    public void testNegativeMultiplication(){
        int expected = -4;
        int actual = calc.multiply(2, -2);
        assertEquals(expected, actual);
    }
}
