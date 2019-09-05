package com.company;

import java.util.Scanner;

public class InputCalculator {

//    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//    The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//
//    When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//
//    XX represents the sum of all entered numbers of type int.
//    YY represents the calculated average of all numbers of type long.

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        long average = 0;

        while(true){
            System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                sum += scanner.nextInt();
                counter++;
            }else{
                average = Math.round( (double) sum/counter);
                System.out.println("SUM = "+ sum + " AVG = "+average);
                break;
            }
        }
        scanner.close();
    }
}
