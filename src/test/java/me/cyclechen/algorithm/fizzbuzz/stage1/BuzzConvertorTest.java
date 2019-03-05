package me.cyclechen.algorithm.fizzbuzz.stage1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BuzzConvertorTest {

    private BuzzConvertor buzzConvertor;


    @Before
    public void init() {
        buzzConvertor = new BuzzConvertor();
    }


    @Test
    public void test_verify() {
        assertFalse(buzzConvertor.verify(1));
        assertTrue(buzzConvertor.verify(10));
    }

}
