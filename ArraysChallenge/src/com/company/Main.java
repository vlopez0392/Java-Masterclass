package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // 	      // Create a program using arrays that sorts a list of integers in descending order.
        //        // Descending order is highest value to lowest.
        //        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        //        // ultimately have an array with 106,81,26, 15, 5 in it.
        //        // Set up the program so that the numbers to sort are read in from the keyboard.
        //        // Implement the following methods - getIntegers, printArray, and sortIntegers
        //        // getIntegers returns an array of entered integers from keyboard
        //        // printArray prints out the contents of the array
        //        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        //        // you will have to figure out how to copy the array elements from the passed array into a new
        //        // array and sort them and return the new sorted array.
        int [] test = getIntegers(5);
        sortIntegers(test);
        printArray(test);
    }

    //PROPOSED SOLUTION @vlopez0392
    //Sort the array
    private static int[] sortIntegers(int[] arrayToSort){
        boolean foundSwap = false;
        boolean continueSort = true;

        int[] sortedArray = new int[arrayToSort.length];
        int temp = 0;

        while(continueSort){ //This is a bubble sort!!! :)
            for(int i = 0; i< arrayToSort.length-1; i++) {
                if(arrayToSort[i] < arrayToSort[i+1]){
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = temp;

                    foundSwap = true;
                }
            }

            if(foundSwap){
                foundSwap = false;
            }else{
                continueSort = false;
            }
        }
        return arrayToSort;
    }

    //Get integers from keyboard
    public static int[] getIntegers(int size){
        int[] array = new int[size];
        boolean getIntegers = true;

        System.out.println("Please enter: " + size +" integer values");
        int count = 0;

        while(getIntegers){
            System.out.println("Please enter integer #"+ (count+1) +": " );
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                array[count] = scanner.nextInt();
                count ++;

                if(count == size) {
                    getIntegers = false;
                }
            }else{
                System.out.println("Invalid input, please try again");
            }
        }
        scanner.close();
        return array;
    }

    //Prints the array
    public static void printArray(int[] array){
        for(int i=0 ; i<array.length ; i++){
            System.out.println("Element #" + (i+1) + " in array: " +array[i]);
        }
    }
}
