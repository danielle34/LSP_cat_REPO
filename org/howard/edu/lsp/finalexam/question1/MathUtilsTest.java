/**
 * Name: Morayo Adeyemi
 */
package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    public void setup() {
        mathUtils = new MathUtils();
    }

    @Test
    @DisplayName("Test case for factorial of zero")
    public void testFactorialOfZero() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    @DisplayName("Test case for factorial of a positive number")
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    @DisplayName("Test case for factorial of a negative number throwing exception")
    public void testFactorialOfNegativeNumberThrowsException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for checking if a prime number is identified correctly")
    public void testIsPrimeForPrimeNumber() {
        assertTrue(mathUtils.isPrime(5));
    }

    @Test
    @DisplayName("Test case for checking if a non-prime number is identified correctly")
    public void testIsPrimeForNonPrimeNumber() {
        assertFalse(mathUtils.isPrime(4));
    }


    @Test
    @DisplayName("Test case for GCD of two positive numbers")
    public void testGcdOfTwoPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24));
    }

    @Test
    @DisplayName("Test case for GCD of two zeros throwing exception")
    public void testGcdOfTwoZerosThrowsException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }

    @Test
    @DisplayName("Test case for GCD of two negative numbers")
    public void testGcdOfNegativeNumbers() {
        assertEquals(5, mathUtils.gcd(-25, -10));
    }
}
