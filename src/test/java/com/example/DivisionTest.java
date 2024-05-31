package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DivisionTest {

    @Test
    public void testCalculate() {
        Calculator calculator = new Division();
        assertEquals("Division should divide two numbers", 2, calculator.calculate(6, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculate_ZeroDivision() {
        Calculator calculator = new Division();
        calculator.calculate(1, 0);
    }
}
