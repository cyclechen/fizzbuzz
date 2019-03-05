package me.cyclechen.algorithm.fizzbuzz.stage2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuzzConvertorTest {


    private BuzzConvertor buzzConvertor;


    @Before
    public void init() {
        buzzConvertor = new BuzzConvertor();
        buzzConvertor.setNextConvertor(new DefaultConvertor());
    }


    @Test
    public void verify() {
        assertFalse(buzzConvertor.verify(1));
        assertTrue(buzzConvertor.verify(5));
        assertTrue(buzzConvertor.verify(10));
        assertFalse(buzzConvertor.verify(21));
        assertTrue(buzzConvertor.verify(25));
        assertTrue(buzzConvertor.verify(52));
    }

}