package calculator;
import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calc = new Calculator();

    @Test
    public void squarerootTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 2, calc.SquareRoot(4), DELTA);
        assertEquals ("Square root of an Int - True Positive", 4, calc.SquareRoot(16), DELTA);
    }

    @Test
    public void squarerootFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 3, calc.SquareRoot(7), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 5, calc.SquareRoot(49), DELTA);
    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 1, calc.factorial(1), DELTA);
        assertEquals ("Square root of an Int - True Positive", 120, calc.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 0, calc.factorial(0), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 12, calc.factorial(4), DELTA);
    }

    @Test
    public void logTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 0, calc.log(1), DELTA);
        assertEquals ("Square root of an Int - True Positive", 2.302585092994046, calc.log(10), DELTA);
    }

    @Test
    public void logFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 0, calc.log(2), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 12, calc.log(4), DELTA);
    }

    @Test
    public void powerTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 0, calc.power(0, 1), DELTA);
        assertEquals ("Square root of an Int - True Positive", 100, calc.power(10, 2), DELTA);
    }

    @Test
    public void powerFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 0, calc.power(2, 0), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 12, calc.power(4, 3), DELTA);
    }
}
