package com.vyrvykhvost;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;
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

    }

    @Test
    void findSum() {
        double expected = 13594.060487738334;
        double actual = calculator.findSum(calculator.findArgY());
        assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
    }

    @Test
    void findMaxMinWithIndex() {
    }

    @ParameterizedTest
    @CsvSource({"50, 3.148703935719195", "1050, 13.88999999999998", "1300, -2.453155838393788"})
    void findElementFromIndex(int index, double expectedElement) {
        assertEquals(calculator.findElementFromIndex(index), expectedElement);
    }
}