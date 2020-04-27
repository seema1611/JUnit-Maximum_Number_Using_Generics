package com.maximumnumber.test;

import com.maximumnumber.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum=new FindMaximum();

    //UseCase-1
    //TC-1.1
    @Test
    public void givenMaximumNumber_atFirstPosition_shouldReturnFirstNumber() {
        Comparable maximumNumber=findMaximum.findMaximumNumber(80,50,30);
        Assert.assertEquals(80,maximumNumber);
    }

    //TC-1.2
    @Test
    public void givenMaxInteger_atSecondPosition_shouldReturnSecondPosition() {
        Comparable maximumNumber=findMaximum.findMaximumNumber(50,80,30);
        Assert.assertEquals(80,maximumNumber);
    }

    //TC-1.3
    @Test
    public void givenMaxInteger_atThirdPosition_shouldReturnThirdPosition() {
        Comparable maximumNumber = findMaximum.findMaximumNumber(30, 50, 80);
        Assert.assertEquals(80, maximumNumber);
    }

    //UseCase-2
    //TC:2.1
    @Test
    public void givenMaxFloat_atFirstPosition_shouldReturnFirstPosition() {
        Comparable maximumNumber = findMaximum.findMaximumNumber(80.6,50.8,30.2);
        Assert.assertEquals(80.6, maximumNumber);
    }
    //TC:2.2
    @Test
    public void givenMaximumFloat_atSecondPosition_shouldReturnFirstPosition() {
        Comparable maximumNumber = findMaximum.findMaximumNumber(30.2,80.6,50.8);
        Assert.assertEquals(80.6, maximumNumber);
    }
    //TC:2.3
    @Test
    public void givenMaxFloat_atThirdPosition_shouldReturnFirstPosition() {
        Comparable maximumNumber = findMaximum.findMaximumNumber(30.2, 50.8, 80.6);
        Assert.assertEquals(80.6, maximumNumber);
    }
}
