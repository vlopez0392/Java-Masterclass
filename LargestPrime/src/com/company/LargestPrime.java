package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class LargestPrime {
//    Write a method named getLargestPrime with one parameter of type int named number.
//    If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//    The method should calculate the largest prime factor of a given number and return it.

    public static int getLargestPrime(int number){
        if(number <= 1) {
            return -1;
        }

        boolean primeNotFound = true;
        int largestPrime = 0;

        while(primeNotFound){
            if(number%2 ==0){ //Even number
                number /= 2;
                if(number == 1){
                    largestPrime = 2;
                    primeNotFound = false;
                }
            }else{  //Odd number
                for(int k=3; k <= number; k+=2){
                    if(number%k==0 ){
                        number = number/k;
                        largestPrime = number;

                        if(largestPrime ==1){
                            primeNotFound = false;
                            largestPrime *= k;
                        }
                        break;
                    }
                }
            }
        }
        return  largestPrime;
    }
}
