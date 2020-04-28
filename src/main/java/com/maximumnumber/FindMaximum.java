package com.maximumnumber;

import java.util.Arrays;

public class FindMaximum < V extends Comparable <V> > {

    // Array of Values
    V[] valuesArray;

    //default constructor
    public FindMaximum() {

    }

    // Generic method to find Maximum Value
    public <V extends Comparable<V>> V findMaximumValue(V... valuesArray) {
        Arrays.sort(valuesArray);
        V maximumValue= valuesArray[valuesArray.length-1];
        printMaximumValue(maximumValue);
        return valuesArray[valuesArray.length-1];
    }

    // Generic Method to Print the Maximum Value
    private <V extends Comparable<V>> void printMaximumValue(V maximumValue) {
        System.out.println("Maximum Value is:"+maximumValue);
    }

    //Main Method
    public static void main(String args[]) {
        System.out.println("Findout Maximum Number");
    }
}
    /*//Method to Find Maximum Number Between three Integer Numbers
    public static int findMaximumNumber(int firstNumber,int secondNumber,int thirdNumber) {
        int maximumNumber=0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber) {
            return maximumNumber=firstNumber;
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            return maximumNumber=secondNumber;
        } else {
            return maximumNumber=thirdNumber;
        }
    }

    //Method to Find Maximum Number Between three float Numbers
    public static double findMaximumNumber( double firstNumber,double secondNumber,double thirdNumber) {
        double maximumNumber=0.0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber) {
            return maximumNumber=firstNumber;
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            return maximumNumber=secondNumber;
        } else {
            return maximumNumber=thirdNumber;
        }
    }

    //Method to Find Maximum String Between three Strings
    public String findMaximumString(String firstString,String secondString,String thirdString) {
        String maximumString=firstString;
        if(secondString.compareTo(maximumString)>0) {
            maximumString=secondString;
        }
        if(thirdString.compareTo(maximumString)>0) {
            maximumString=thirdString;
        }
        return maximumString;
    }*/
