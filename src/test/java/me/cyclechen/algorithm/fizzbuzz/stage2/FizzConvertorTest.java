package me.cyclechen.algorithm.fizzbuzz.stage2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzConvertorTest {

    private FizzConvertor fizzConvertor;

    @Before
    public void init() {
        fizzConvertor = new FizzConvertor();
        fizzConvertor.setNextConvertor(new DefaultConvertor());
    }

    @Test
    public void verify() {
        assertFalse(fizzConvertor.verify(4));
        assertFalse(fizzConvertor.verify(88));
        assertTrue(fizzConvertor.verify(3));
        assertTrue(fizzConvertor.verify(35));
        assertTrue(fizzConvertor.verify(53));
    }

}