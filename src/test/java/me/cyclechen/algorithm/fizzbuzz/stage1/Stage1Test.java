package me.cyclechen.algorithm.fizzbuzz.stage1;

import org.junit.Assert;
import org.junit.Test;

public class Stage1Test {

    @Test
    public void stage1() {
        Stage1 stage1 = new Stage1();
        Assert.assertEquals("2", stage1.convert(2));
        Assert.assertEquals("Fizz", stage1.convert(3));
        Assert.assertEquals("Buzz", stage1.convert(5));
        Assert.assertEquals("FizzBuzz", stage1.convert(15));
        Assert.assertEquals("32", stage1.convert(32));
        Assert.assertEquals("53", stage1.convert(53));
    }
}
