package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void testCalculate() {
        Calculator calculator = new Multiplication();
        assertEquals("Multiplication should multiply two numbers", 6, calculator.calculate(2, 3), 0.001);
    }
}
