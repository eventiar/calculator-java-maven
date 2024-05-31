package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdditionTest {

    @Test
    public void testCalculate() {
        Calculator calculator = new Addition();
        assertEquals("Addition should add two numbers", 5, calculator.calculate(2, 3), 0.001);
    }
}
