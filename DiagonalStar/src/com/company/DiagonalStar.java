package com.company;

public class DiagonalStar {
//    Write a method named printSquareStar with one parameter of type int named number.
//
//    If number is < 5, the method should print "Invalid Value".
//
//    The method should print diagonals to generate a rectangular pattern composed of stars (*)

    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }else{
            for(int i =1; i<=number; i++){
                for(int j=1 ; j<= number ; j++){
                    if(i==1 || i==number || j==1 || j==number || i==j || i+j-1==number){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
