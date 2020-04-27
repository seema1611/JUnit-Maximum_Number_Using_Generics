package com.maximumnumber;

public class FindMaximum < V extends Comparable <V> > {

    //class parameter
    V firstValue;
    V secondValue;
    V thirdValue;

    //Default Constructor
    public FindMaximum() {

    }

    //Paramerized Constructor
    public FindMaximum(V firstValue, V secondValue, V thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public V findMaximumValue(V firstValue, V secondValue, V thirdValue) {
        V maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0) {
            maximumValue = secondValue;
        }
        if (thirdValue.compareTo(maximumValue) > 0) {
            maximumValue = thirdValue;
        }
        return maximumValue;
    }

    //Main method
    public static void main(String args[]) {
        System.out.println("Findout Maximum number");
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
    }
}*/
