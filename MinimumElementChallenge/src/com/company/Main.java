package com.company;

import java.util.Scanner;

public class Main {
    //Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
    //
    //The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
    //
    //Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
    //
    //In the main() method read the count from the console and call the method readIntegers() with the count parameter.
    //
    //Then call the findMin() method passing the array returned from the call to the readIntegers() method.
    //
    //Finally, print the minimum element in the array.
    //
    //Tips:
    //	-Assume that the user will only enter numbers, never letters
    //	-For simplicity, create a Scanner as a static field to help with data input
    //	-Create a new console project with the name eMinElementChallengef

    private static Scanner scanner= new Scanner(System.in); //Declared static so other static methods may also access it.
                                                            //We do not need to make a new instance of Scanner every time
                                                            //we use it.

    public static void main(String[] args) {
        System.out.println("Enter the size of your array: ");
        int capacity = scanner.nextInt();

        int[] testArray = readIntegers(capacity);
        int min = findMinArray(testArray);
        System.out.println("Minimum element is: " + min);
    }

    private static int findMinArray(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i =0; i< array.length ; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private static int[] readIntegers(int capacity){
        System.out.println("Please enter " + capacity + " integers:");
        boolean continueReading = true;
        boolean isAnInt;

        int count = 0;
        int[] array = new int[capacity];

        while (continueReading) {
            System.out.println("Please enter integer #"+ (count+1) +": " );
            isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                array[count] = scanner.nextInt();
                count++;

                if(count == capacity){
                    continueReading = false;
                }
            } else {
                System.out.println("Invalid input, please try again");
            }
        }
        scanner.close();
        return array;
    }
}
