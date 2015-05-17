package com.jrw82.util;


import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for PrimeCalculator
 */
public class PrimeCalculatorTest {
    // test output for primes up to 1
    @Test
    public void testPrimeOfOne() {
        LinkedList<Integer> actual = PrimeCalculator.computePrimes(1);

        assertTrue("Expected the result list to be empty", actual.isEmpty());
    }

    // test output for primes of negative number
    @Test
    public void testPrimeOfNegative() {
        LinkedList<Integer> actual = PrimeCalculator.computePrimes(-10);

        assertTrue("Expected the result list to be empty", actual.isEmpty());
    }

    // test output for primes up to 2
    @Test
    public void testPrimeOfTwo() {
        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(2);
        LinkedList<Integer> actual = PrimeCalculator.computePrimes(2);

        assertEquals("Expected that lists be equal", expected, actual);
    }

    // test output for arbitrary value of 25
    @Test
    public void testPrimes() {
        Integer[] data = new Integer[]{2,3,5,7,11,13,17,19,23};
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(data));

        LinkedList<Integer> actual = PrimeCalculator.computePrimes(25);

        assertEquals("Expected that lists be equal", expected, actual);
    }
}
