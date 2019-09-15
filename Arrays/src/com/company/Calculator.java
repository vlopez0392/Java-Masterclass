package com.company;

import java.util.Scanner;

public class Calculator {

    //Let's take input from the user. THe input will consist of numbers only. Then, we will sum up those numbers and
    //we will calculate the average of those numbers.
    Scanner scanner = new Scanner(System.in);

    public int[] getIntegers(int number){
        System.out.println("Enter " + number +" integer values: " );

        int[] values = new int[number];
        for(int i = 0; i<values.length ; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length ; i++){
            sum += array[i];
        }

        return (double)(sum) /( (double) array.length);
    }
}
