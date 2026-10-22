import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    // Individual, single input tests for specific cases
    @Test
    public void testForNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> dateChecker.has31Days(null));
        String expectedMessage = "Invalid Month.";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testForJanuary(){
        assertTrue(dateChecker.has31Days(DateChecker.Month.JANUARY));
    }
    @Test
    public void testForFebruary(){
        assertFalse(dateChecker.has31Days(DateChecker.Month.FEBRUARY));
    }

    // Parameterized tests, asserts that a group of months handles as expected
    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY"
                                                            ,"AUGUST", "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month){
        assertTrue(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER"
                                                            ,"NOVEMBER"})
    public void testNotHas31Days(DateChecker.Month month){
        assertFalse(dateChecker.has31Days(month));
    }
}
