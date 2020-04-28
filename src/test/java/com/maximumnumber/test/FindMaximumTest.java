package com.maximumnumber.test;

import com.maximumnumber.FindMaximum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {
    private FindMaximum findMaximum;

    @Before
    public void initialize() {
        findMaximum =new FindMaximum();
    }

    //UseCase-1
    //TC-1.1
    @Test
    public void givenMaximumNumber_WhenFirstPosition_shouldReturnFirstNumber() {
        Comparable maximumInteger = findMaximum.findMaximumValue(80, 50, 30);
        Assert.assertEquals(80, maximumInteger);
    }

    //TC-1.2
    @Test
    public void givenMaxInteger_WhenSecondPosition_shouldReturnSecondPosition() {
        Comparable maximumInteger = findMaximum.findMaximumValue(50, 80, 30);
        Assert.assertEquals(80, maximumInteger);
    }

    //TC-1.3
    @Test
    public void givenMaxInteger_WhenThirdPosition_shouldReturnThirdPosition() {
        Comparable maximumInteger = findMaximum.findMaximumValue(30, 50, 80);
        Assert.assertEquals(80, maximumInteger);
    }

    //UseCase-2
    //TC:2.1
    @Test
    public void givenMaxFloat_WhenFirstPosition_shouldReturnFirstPosition() {
        Comparable maximumFloat = findMaximum.findMaximumValue(80.6, 50.8, 30.2);
        Assert.assertEquals(80.6, maximumFloat);
    }

    //TC:2.2
    @Test
    public void givenMaximumFloat_WhenSecondPosition_shouldReturnFirstPosition() {
        Comparable maximumFloat = findMaximum.findMaximumValue(30.2, 80.6, 50.8);
        Assert.assertEquals(80.6, maximumFloat);
    }

    //TC:2.3
    @Test
    public void givenMaxFloat_WhenThirdPosition_shouldReturnFirstPosition() {
        Comparable maximumFloat = findMaximum.findMaximumValue(30.2, 50.8, 80.6);
        Assert.assertEquals(80.6, maximumFloat);
    }

    //UseCase-3
    //TC:3.1
    @Test
    public void givenMaximumString_WhenFirstPosition_shouldReturnFirstPosition() {
        Comparable maximumString=findMaximum.findMaximumValue("seema","hello","abc");
        Assert.assertEquals("seema", maximumString);
    }

    //TC:3.2
    @Test
    public void givenMaximumStringA_WhenSecondPosition_shouldReturnSecondPosition() {
        Comparable maximumString = findMaximum.findMaximumValue("abc", "seema", "hello");
        Assert.assertEquals("seema", maximumString);
    }

    //TC:3.3
    @Test
    public void givenMaximumString_WhenThirdPositiom_shouldReturnThirdPosition() {
        Comparable maximumString = findMaximum.findMaximumValue("hello", "abc", "seema");
        Assert.assertEquals("seema", maximumString);
    }
}