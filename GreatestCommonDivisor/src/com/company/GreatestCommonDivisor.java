package com.company;

public class GreatestCommonDivisor {

    //Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    //If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
    //The method should return the greatest common divisor of the two numbers (int).
    //The greatest common divisor is the largest positive integer that can fully divide each of the
    //integers (i.e. without leaving a remainder).

    public static int getGreatestCommonDivisor(int first, int second){
        if(first >= 10 && second >= 10){
            if(first == second){
                return second;
            }

            //Euclid's algorithm
            if(first<second) {
                int temp = 0;
                temp = first;
                first = second;
                second = temp;
            }

            int quotient  = 0;
            int remainder = 0;

            while(true) {
                remainder = first%second;

                if(remainder == 0){
                    return second;
                }
                first = second;
                second = remainder;
            }
        }
        return -1;
    }
}
