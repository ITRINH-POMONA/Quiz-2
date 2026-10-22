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
}
