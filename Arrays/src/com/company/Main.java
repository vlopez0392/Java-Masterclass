package com.company;

public class Main {

    public static void main(String[] args) {

        //Declaring arrays of several types
	    int [] myArray = new int[25];
	    myArray[5] = 50;
	    double [] doubleArray = new double[10];

	    //Declaring multiple elements at once
        int[] multiple = {1,2,3,4,5,6}; //This can only be done when declaring a new array

        //We can also use for-loops to initialize Arrays
        int[] forArray = new int[10];

        for(int i=0; i<25; i++){        //Hard-coded value for the for-loop index
            myArray[i] = i*2;
        }

        //More effectively, use array.length to control the for-loops (See method!)
        //In addition, we can also pass arrays as method parameters
        printArray(myArray);


        //Lets test the Calculator class (Check out this class for more info on it's functionality)
        Calculator myCalculator = new Calculator();

        int[] myIntegers = myCalculator.getIntegers(5);
        printArray(myIntegers);

        System.out.println("The average is: " + myCalculator.getAverage(myIntegers));
    }

        //printArray method
        public static void printArray(int[] array){
            for(int i=0; i<array.length; i++){
                System.out.println("Element " + i + ", value is: " + array[i]);
            }

        }
}
