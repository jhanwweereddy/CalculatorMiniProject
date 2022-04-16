package calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;

import java.lang.Math;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double SquareRoot(int x)
    {
        logger.info("Square root of "+x+"\t"+ Math.sqrt(x));
        return Math.sqrt(x);
    }
    public double factorial(int x)
    {
        double fac = 1;
        for(int i =2;i<=x;i++)
        {
            fac = fac*i;
        }
        logger.info("Factorial of "+x+"\t"+ fac);
        return fac;
    }

    public double log(int x)
    {
        logger.info("Logarithm of "+x+"\t"+ Math.log(x));
        return Math.log(x);
    }

    public double power(int x , int y)
    {
        logger.info(x+"Power"+y+"\t"+ Math.pow(x, y));
        return Math.pow(x, y);
    }
}