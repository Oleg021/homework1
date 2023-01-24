package com.vyrvykhvost;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    public final static double EPS = 1e-9;

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testCalculate() {
        double x = 0.2;
        double expectedY = 3.3138302146549767;
        double actual = calculator.calculate(x);
        assertEquals(expectedY, actual, EPS);
    }

    @Test
    void testCalculateStep() {
        int expected = 1301;
        int actual = calculator.calculateStep();
        assertEquals(expected, actual);
    }

    @Test
    void testFindArgY() {
        double[] expectedArray = calculator.findArgY();
        double[] actualArray = calculator.findArgY();
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testFindArgX() {
        double[] expectedArray = calculator.findArgX();
        double[] actualArray = calculator.findArgX();
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testFindMaxAndMin() {
        String expected = "Max = 2.7999999999999132\n" +
                "Min = 0.2";
        String actual = calculator.findMaxAndMin(calculator.findArgX());
        assertEquals(expected, actual);
    }

    @Test
    void testFindSum() {
        double expected = 13594.060487738334;
        double actual = calculator.findSum(calculator.findArgY());
        assertEquals(expected, actual);
    }

    @Test
    void testFindAverage() {
        String expected = "Average = 10.448931965978735\n" +
                "Sum = 13594.060487738334";
        String actual = calculator.findAverage(calculator.findArgY());
        assertEquals(expected, actual);
    }

    @Test
    void findMaxMinWithIndex() {
        String expected = "Max = 2.7999999999999132 withIndex: 1300\n" +
                "Min = 0.2 with index: 0";
        String actual = calculator.findMaxMinWithIndex(calculator.findArgX());
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"50, 3.148703935719195", "1050, 13.88999999999998", "1300, -2.453155838393788"})
    void testFindElementFromIndex(int index, double expectedElement) {
        assertEquals(calculator.findElementFromIndex(index), expectedElement);
    }
}