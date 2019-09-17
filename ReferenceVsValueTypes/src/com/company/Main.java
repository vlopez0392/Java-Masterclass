package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //All primitive types are value types -> They hold a value
        //Arrays and Strings are reference types -.They hold a reference

        int myIntValue = 10;
        int anotherIntValue = myIntValue;   //Both variables have the value of 10;

        System.out.println("My int value = " +myIntValue );
        System.out.println("My anotherInt value = " +anotherIntValue);

        anotherIntValue++;

        System.out.println("My int value = " +myIntValue );
        System.out.println("My anotherInt value = " +anotherIntValue);

        //When we create a value type, a single space in memory is allocated to hold the value and each variable directly
        //holds the value. If you assign it to another variable the value is copied directly and both variables work
        //independently.

        //Reference types work differently
        //new keyword -> A new object is created.

        int[] myIntArray = new int[5]; //myIntArray is a reference to the array we have just created.

        //References hold a reference to an address of an object BUT not the object itself.

        int[] anotherArray = myIntArray; //Now we have two references pointing to the same array in memory.

        //Two print out the contents of each array, we will use a built-in static method in the Arrays class called toString();

        System.out.println("myIntArray " + Arrays.toString(myIntArray)); //toString() -> Joins multiple Strings or objects
                                                                         //into a String using a comma as a separator.
        System.out.println("myAnotherArray: " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray after change: " + Arrays.toString(myIntArray));
        System.out.println("myAnotherArray after change: " + Arrays.toString(anotherArray));

        //Because both variables reference to the same array in memory, changing anotherArray reflects on myIntArray as well.
        //Reference types represent the address of the variable rather than the data itself.
        //Both of the above variables represent the same address in memory.
        //Only one array in memory -> Both variables are pointing to it.

        //Lets observe the behavior of reference types when we pass them as parameters in methods
        modifyArray(myIntArray);

        System.out.println("myIntArray after modify: " + Arrays.toString(myIntArray));
        System.out.println("myAnotherArray after modify: " + Arrays.toString(anotherArray));

        //Now, lets de-reference anotherArray
        anotherArray = new int[] {4,5,6,7,8}; //anotherArray now points to another object in memory. We used the new keyword!

        System.out.println("myIntArray after de-reference: " + Arrays.toString(myIntArray));
        System.out.println("myAnotherArray after de-reference: " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){ //The address is copied to the parameter. -Now we have three references to
        //array[0] = 2;                             //the array where the parameter is the third reference.

        //We can de-reference the array parameter using the new keyword
        array = new int[] {1,2,3,4,5}; //This change is not seen by the references outside the parameter.
                                       //In other words, a parameter is not able to change a reference. It only able to
                                       //de-reference the original reference.
    }
}
