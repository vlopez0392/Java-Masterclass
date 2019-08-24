package com.company;

public class IntEqualityPrinter {
//    Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
//    If one of the parameters is less than 0, print text "Invalid Value".

//    If all numbers are equal print text "All numbers are equal"
//    If all numbers are different print text "All numbers are different".

//    Otherwise, print "Neither all are equal or different".

    public static void printEqual(int a, int b, int c){
        if(a>=0 && b>=0 && c>=0) {
            if (a == b && b == c) {
                System.out.println("All numbers are equal");
            } else if (a == b || a == c || b == c) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
            return;
        }
        System.out.println("Invalid Value");
    }
}
