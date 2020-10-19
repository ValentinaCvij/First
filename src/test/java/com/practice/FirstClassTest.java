package com.practice;


import org.junit.Assert;
import org.junit.Test;

public class FirstClassTest {
    @Test
    public void FirstNormalNumbers() {
        FirstClass fc = new FirstClass();
        Assert.assertEquals("1", fc.convert(1));
        Assert.assertEquals("2", fc.convert(2));
    }

    @Test
    public void FirstThreeNumbers() {

        FirstClass fc = new FirstClass();
        Assert.assertEquals("Some", fc.convert(3));
    }

    @Test
    public void FirstFiveNumbers() {

        FirstClass fc = new FirstClass();
        Assert.assertEquals("Thing", fc.convert(5));
    }

    @Test
    public void FirstThreeAndFiveNumbers() {

        FirstClass fc = new FirstClass();
        Assert.assertEquals("Thing", fc.convert(5));
    }

}