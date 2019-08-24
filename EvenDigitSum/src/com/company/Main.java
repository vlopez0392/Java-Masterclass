package com.company;

public class Main {

    public static void main(String[] args) {
        getEvenDigitSum(12);         //2
        getEvenDigitSum(123456789); //20
    }
    // Write a method named getEvenDigitSum with one parameter of type int called number.
    //The method should return the sum of the even digits within the number.
    //
    //If the number is negative, the method should return -1 to indicate an invalid value.

    public static int getEvenDigitSum(int number){
        if(number >= 0 ){
            int sum = 0;
            int currentDigit;
            int discard = number;

            while(discard > 0){
                currentDigit = discard%10;

                if(currentDigit%2==0){
                    sum += currentDigit;
                }
                discard /= 10;
            }
            System.out.println("The even digit sum of "+number+ " is: "+sum);
            return sum;
        }
        System.out.println("Invalid Value");
        return -1;
    }
}
