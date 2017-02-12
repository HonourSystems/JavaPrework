package com.smsmt.ae.programming.prework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrimeGenerator {

    @Test
    public void testFirstPrime() {
        assertEquals("First prime is not 2", 2, PrimeGenerator.generate(1));
    }

    @Test
    public void testSecondPrime() {
        assertEquals("Second prime is not 2", 3, PrimeGenerator.generate(2));
    }

    @Test
    public void testThirdPrime() {
        assertEquals("Third prime is not 2", 5, PrimeGenerator.generate(3));
    }

    @Test
    public void testSeventhPrime() {
        assertEquals("Seventh prime is not 2", 17, PrimeGenerator.generate(7));
    }

    @Test
    public void testHundredthPrime() {
        assertEquals("First prime is not 2", 541, PrimeGenerator.generate(100));
    }

}
