package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SubtractionTest {

    @Test
    public void testCalculate() {
        Calculator calculator = new Subtraction();
        assertEquals("Subtraction should subtract two numbers", -1, calculator.calculate(2, 3), 0.001);
    }
}
