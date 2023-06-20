package com.carector;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testNegatives1() {
        try {
            int result = StringCalculator.add("-1, 5");
            assert false;
        } catch (Exception e) {
            // If an exception was thrown, the test passed
            assertTrue(e.getMessage().equals("Negatives not allowed."));
        }
    }

    @Test
    public void testNegatives2() {
        try {
            int result = StringCalculator.add("5, -4");
            assert false;
        } catch (Exception e) {
            // If an exception was thrown, the test passed
            assertTrue(e.getMessage().equals("Negatives not allowed."));
        }
    }

    @Test
    public void testGreaterThan1000_1() {
        try {
            int result = StringCalculator.add("1, 99999");
            assertTrue(result == 1);
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void testGreaterThan1000_2() {
        try {
            int result = StringCalculator.add("999, 1000");
            assertTrue(result == 999);
        } catch (Exception e) {
            assert false;
        }
    }
}
