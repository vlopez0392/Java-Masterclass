package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12,32,14));      //true
        System.out.println(hasSameLastDigit(125, 256, 432)); //false
    }

    // Write a method named hasSameLastDigit with three parameters of type int.
    //Each number should be within the range of 10 (inclusive) - 1000 (inclusive).

    // If one of the numbers is not within the range, the method should return false.
    //The method should return true if at least two of the numbers share the same rightmost digit; otherwise,
    // it should return false.

    //Write another method named isValid with one parameter of type int.
    //The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
    // otherwise return false.

    private static boolean hasSameLastDigit(int a, int b, int c){

        if(isValid(a) && isValid(b) && isValid(c)){

            return (Math.abs(a-b)%10==0 || Math.abs(a-c)%10==0 ||
                    Math.abs(b-c)%10==0 );
        }
        return false;
    }

    private static boolean isValid(int val){
        if(val < 10  || val >1000){
            return false;
        }
        return true;
    }
}
