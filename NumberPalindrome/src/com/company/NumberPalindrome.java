package com.company;

public class NumberPalindrome {

//    Write a method called isPalindrome with one int parameter called number.
//    The method needs to return a boolean.
//    It should return true if the number is a palindrome number otherwise it should return false.

    public static boolean isPalindrome(int number){

        int discard = number;
        if(discard < 0){
            discard *= -1;
        }

        int lastDigit;
        int palindrome = 0;
        while(discard > 0){
            lastDigit = discard % 10;
            palindrome = palindrome * 10 + lastDigit;
            discard /= 10;
            }

        if(number < 0){
            palindrome *= -1;
        }

        if((palindrome-number)==0){
            System.out.println("Number: "+number+ " Palindrome? "+palindrome + " Yes!!" );
            return true;
        }

        System.out.println("Sorry, "+ number + " is NOT a palindrome");
        return false;
    }
}
