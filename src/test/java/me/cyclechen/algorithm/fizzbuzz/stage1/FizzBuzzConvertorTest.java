package me.cyclechen.algorithm.fizzbuzz.stage1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzConvertorTest {

    private FizzBuzzConvertor fizzBuzzConvertor;

    @Before
    public void setUp() throws Exception {
        fizzBuzzConvertor = new FizzBuzzConvertor();
        fizzBuzzConvertor.setNextConvertor(new DefaultConvertor());
    }

    @Test
    public void verify() {
        assertFalse(fizzBuzzConvertor.verify(1));
        assertFalse(fizzBuzzConvertor.verify(19));
        assertTrue(fizzBuzzConvertor.verify(15));
        assertTrue(fizzBuzzConvertor.verify(30));
        assertFalse(fizzBuzzConvertor.verify(53));
    }

}