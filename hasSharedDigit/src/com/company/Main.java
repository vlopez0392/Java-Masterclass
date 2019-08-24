package com.company;

public class Main {

    public static void main(String[] args) {
        hasSharedDigit(12,21);
        hasSharedDigit(9,12);
        hasSharedDigit(15,51);
    }
    // Write a method named hasSharedDigit with two parameters of type int.

    //Each number should be within the range of 10 (inclusive) - 99 (inclusive).
    // If one of the numbers is not within the range, the method should return false.
    //
    //The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
    // otherwise, the method should return false.

    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10 || num1 > 99) || (num2<10 || num2 >99)){
            return false;
        }
        int currentDigit1;
        int currentDigit2;
        int discard1 = num1;
        int discard2 = num2;

        while(discard1 > 0){
            currentDigit1 = discard1%10;

            while(discard2 > 0){
                currentDigit2 = discard2%10;

                if(currentDigit2 == currentDigit1){
                    System.out.println("Found shared digit:" + currentDigit1 + " between " + num1 + " and " + num2 );
                    return true;
                }
                discard2 /= 10;
            }
            discard2 = num2;
            discard1 /= 10;
        }
        System.out.println("NO shared digits between "+num1 + " and "+ num2);
        return false;
    }
}
