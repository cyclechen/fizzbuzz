package me.cyclechen.algorithm.fizzbuzz.stage1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzConvertorTest {

    private FizzConvertor fizzConvertor;

    @Before
    public void init() {
        fizzConvertor = new FizzConvertor();
    }


    @Test
    public void test_verify() {
        assertFalse(fizzConvertor.verify(1));
        assertTrue(fizzConvertor.verify(66));
    }
}
