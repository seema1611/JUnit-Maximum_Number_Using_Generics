package com.maximumnumber.test;

import com.maximumnumber.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum=new FindMaximum();

    //UseCase-1
    //TC-1
    @Test
    public void givenMaximumNumber_atFirstPosition_shouldReturnFirstNumber() {
        Comparable maximumNumber=findMaximum.findMaximumNumber(80,50,30);
        Assert.assertEquals(80,maximumNumber);
    }

    //TC-2
    @Test
    public void givenMaxInteger_atSecondPosition_shouldReturnSecondPosition() {
        Comparable maximumNumber=findMaximum.findMaximumNumber(50,80,30);
        Assert.assertEquals(80,maximumNumber);
    }

    //TC-3
    @Test
    public void givenMaxInteger_atThirdPosition_shouldReturnThirdPosition() {
        Comparable maximumNumber = findMaximum.findMaximumNumber(30, 50, 80);
        Assert.assertEquals(80, maximumNumber);
    }
}
