package com.carector;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringCalculatorTest 
{
    
    @Test
    public void testNegatives1()
    {
        try
        {
            int result = StringCalculator.add("-1, 5");
            assert false;
        }
        catch(Exception e)
        {
            // If an exception was thrown, the test passed
            assertTrue(e.getMessage().equals("Negatives not allowed."));
        }
    }

    @Test
    public void testNegatives2()
    {
        try
        {
            int result = StringCalculator.add("5, 4, 3, 2, 1, 0, -1, -2, -3, -4");
            assert false;
        }
        catch(Exception e)
        {
            // If an exception was thrown, the test passed
            assertTrue(e.getMessage().equals("Negatives not allowed."));
        }
    }

    @Test
    public void testGreaterThan1000_1()
    {
        int result = StringCalculator.add("1, 2, 3, 4, 99999");
        assertTrue(result == 10);
    }

    @Test
    public void testGreaterThan1000_2()
    {
        int result = StringCalculator.add("998, 999, 1000, 1001");
        assertTrue(result == 1997);
    }
}
