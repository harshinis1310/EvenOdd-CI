package com.example; 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", EvenOdd.checkEvenOdd(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(-5));
    }
}