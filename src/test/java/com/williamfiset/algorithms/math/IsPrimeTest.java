package com.williamfiset.algorithms.math;

import static com.google.common.truth.Truth.assertThat;

import com.williamfiset.algorithms.utils.graphutils.GraphGenerator;
import com.williamfiset.algorithms.utils.graphutils.Utils;
import java.util.*;
import org.junit.*;


public class IsPrimeTest {

    @Test
    public void test1() {
        assertThat(true).isTrue();
    }

    @Test
    public void testForMultiplePrimes() {
        int[] primes = {7, 3, 5, 11, 19};

        for(int i = 0; i < primes.length; i++)
            assertThat(IsPrime.isPrime(primes[i])).isTrue();
    }

    @Test
    public void testForMultipleNonPrimes() {
        int[] primes = {16, 28, 100, 102, 786};

        for(int i = 0; i < primes.length; i++)
            assertThat(IsPrime.isPrime(primes[i])).isFalse();
    }

    @Test
    public void testForNumbersLessThan2() {
        int[] primes = {1, 0};

        for(int i = 0; i < primes.length; i++)
            assertThat(IsPrime.isPrime(primes[i])).isFalse();
    }

    @Test
    public void testForNumbersDivisbleBy2And3() {
        int[] primes = {4, 6, 8, 12};

        for(int i = 0; i < primes.length; i++)
            assertThat(IsPrime.isPrime(primes[i])).isFalse();
    }

    @After
    public void after() {
        int trues = 0;

        for(boolean elem : IsPrime.array) {
            System.out.println(elem);
            if(elem == true) trues++;
        }

        System.out.println((float) ((float)trues / IsPrime.array.length));
    }

}
