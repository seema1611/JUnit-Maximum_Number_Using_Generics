package com.maximumnumber;

public class FindMaximum {

    //Method to Find Maximum Number Between three
    public static int findMaximumNumber(int firstNumber,int secondNumber,int thirdNumber)
    {
        int maximumNumber=0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber) {
            return maximumNumber=firstNumber;
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            return maximumNumber=secondNumber;
        } else {
            return maximumNumber=thirdNumber;
        }
    }

    //Main method
    public static void main(String args[])
    {
        //Welcome message display
        System.out.println("Welcome to Test Maximum");
    }
}
