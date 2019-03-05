package me.cyclechen.algorithm.fizzbuzz.stage2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzConvertorTest {

    private FizzBuzzConvertor fizzBuzzConvertor;

    @Before
    public void setUp() throws Exception {
        fizzBuzzConvertor = new FizzBuzzConvertor();
    }

    @Test
    public void test_verify() {
        assertFalse(fizzBuzzConvertor.verify(8));
        assertTrue(fizzBuzzConvertor.verify(15));
        assertTrue(fizzBuzzConvertor.verify(21));
        assertTrue(fizzBuzzConvertor.verify(53));
    }

}