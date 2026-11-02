package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2,1));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiply(1,2));
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.divide(2,2));
    }
}