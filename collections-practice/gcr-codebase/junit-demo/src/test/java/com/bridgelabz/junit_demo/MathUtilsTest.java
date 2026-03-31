package com.bridgelabz.junit_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    MathUtils math = new MathUtils();

    @Test
    void testDivideByZeroException() {
        assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
    }

    @Test
    void testValidDivision() {
        assertEquals(5, math.divide(10, 2));
    }
}
