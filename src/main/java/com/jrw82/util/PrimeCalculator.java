package com.jrw82.util;

import java.util.LinkedList;

/**
 * Simple library to return the list of primes up to a given number - The Sieve of Eratosthenes
 *
 * @author johnsonrw82
 */
public class PrimeCalculator
{

    /**
     * Return a LinkedList containing all prime numbers up to a given number, greater than or equal to 2.
     * @param num the number of which to find the number of primes leading up to
     * @return a list of all primes up to and including num. Empty list returned if no primes exist (num<=1)
     */
    public static LinkedList<Integer> computePrimes(int num) {
        LinkedList<Integer> nums = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        // 2 or higher
        if ( num >= 2) {
            // 2 is prime
            nums.add(2);
            // loop and add all odd numbers
            // assume they are all prime
            for ( int i = 3; i <= num; i+=2 ) {
                nums.add(i);
            }
        }

        // loop through the list, removing all multiples of the number
        while ( nums.size() > 0 ) {
            int nextPrime = nums.remove();
            for ( int i = nextPrime * nextPrime; i <= num; i+=nextPrime) {
                nums.removeFirstOccurrence(i);
            }
            result.add(nextPrime);
        }

        // number of primes up to num
        return result;
    }
}
