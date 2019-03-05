package me.cyclechen.algorithm.fizzbuzz.stage2;

import org.junit.Assert;
import org.junit.Test;

public class Stage2Test {

    @Test
    public void test_convert() {
        Stage2 stage2 = new Stage2();
        Assert.assertEquals("2", stage2.convert(2));
        Assert.assertEquals("Fizz", stage2.convert(3));
        Assert.assertEquals("Buzz", stage2.convert(5));
        Assert.assertEquals("FizzBuzz", stage2.convert(32));
        Assert.assertEquals("FizzBuzz", stage2.convert(53));
    }
}
