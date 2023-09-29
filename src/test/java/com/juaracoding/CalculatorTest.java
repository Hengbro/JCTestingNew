package com.juaracoding;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public  void  testAdd(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(10, 5);

        Assert.assertEquals(actual,15);
    }
}
