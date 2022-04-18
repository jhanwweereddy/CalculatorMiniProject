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
        assertEquals ("Square root of an Int - True Positive", 3, calc.SquareRoot(9), DELTA);
        assertEquals ("Square root of an Int - True Positive", 6, calc.SquareRoot(36), DELTA);
    }

    @Test
    public void squarerootFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 4, calc.SquareRoot(25), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 10, calc.SquareRoot(121), DELTA);
    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 720, calc.factorial(6), DELTA);
        assertEquals ("Square root of an Int - True Positive", 24, calc.factorial(4), DELTA);
    }

    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 0, calc.factorial(0), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 9, calc.factorial(3), DELTA);
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
        assertNotEquals ("Square root of an Int - True Positive", 0, calc.log(4), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 1, calc.log(5), DELTA);
    }

    @Test
    public void powerTruePositive()
    {
        assertEquals ("Square root of an Int - True Positive", 1, calc.power(1, 1), DELTA);
        assertEquals ("Square root of an Int - True Positive", 64, calc.power(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive()
    {
        assertNotEquals ("Square root of an Int - True Positive", 1, calc.power(2, 1), DELTA);
        assertNotEquals ("Square root of an Int - True Positive", 12, calc.power(2, 6), DELTA);
    }
}
