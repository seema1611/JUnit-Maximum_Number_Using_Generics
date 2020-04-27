package com.maximumnumber;

public class FindMaximum {

    //Method to Find Maximum Number Between three Integer Numbers
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
    public static double findMaximumNumber( double firstNumber,double secondNumber,double thirdNumber)
    {
        double maximumNumber=0.0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber) {
            return maximumNumber=firstNumber;
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            return maximumNumber=secondNumber;
        } else {
            return maximumNumber=thirdNumber;
        }
    }

    //Main method
    public static void main(String args[]) {
        System.out.println("Welcome to findout Maximum Number");
    }
}
