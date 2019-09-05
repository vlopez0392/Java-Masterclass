package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        //-Before the user enters the number, print the message "Enter number: "
        //-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE; //First input made by the user will be less than Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; //First input made by the user will be greater than Integer.MIX_VALUE;

        while (true){
            System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int currentNumber = scanner.nextInt();

                if(currentNumber > max){
                    max = currentNumber;
                }
                if(currentNumber < min ){
                    min = currentNumber;
                }
            }else{
                System.out.println("MIN = "+ min +" MAX = " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
