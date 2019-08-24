package com.company;

public class FirstLastDigitSum {

    // Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    // The method needs to find the first and the last digit of the parameter number passed to the method,
    // Using a loop and return the sum of the first and the last digit of that number.

    //If the number is negative then the method needs to return -1 to indicate an invalid value.

    public static int sumFirstAndLastDigit(int number){
        if(number >= 0){
            if(number < 10){
                return 2*number;
            }

            int currentDigit = 0;
            int firstDigit = 0;
            int count = 0;

            while(number > 0){
                currentDigit = number%10;
                number /= 10;

                if(count == 0){
                    firstDigit = currentDigit;
                }
                count++;
            }
            return currentDigit+firstDigit;
        }
        return -1;
    }
}
