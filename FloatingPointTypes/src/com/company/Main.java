package com.company;

public class Main {
    public static void main(String[] args) {
	// Floating point numbers have fractional parts
    // Used when more precision is needed in calculations

    //We have two types of floating-point types: Floating point and Double
    //float -> Has single precision and occupies 32 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+myMinFloatValue);
        System.out.println("Float maximum value = "+myMaxFloatValue);
        
    //Double -> Has double precision and occupies 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = "  + myMinDoubleValue);
        System.out.println("Double maxmimum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;  //Add an f to declare a float/ No need to use
        float castFloat = (float) 5.25; //Cast is not recommended!

        double myDoubleValue =5.25d; // Default floating-point number and preferred to use
                                     // Java math libraries are programmed to handle doubles
                                     // More precision!
        //Challenge!!
        int challengeInt = 5/3;
        float challengeFloat = 5f / 3f;
        double challengeDouble = 5d / 3d;

        System.out.println("My int value = " +challengeInt);
        System.out.println("My float value = " +challengeFloat);
        System.out.println("My double value = " +challengeDouble);

        // Convert a given number of pounds into kilograms
        // Create a variable with the appropriate type to store the pounds to be converted to kilograms.
        // Calculate the result i.e. the number of kilograms based on the contents of the variable above and
        // store the result in a 2nd appropriate variable.

        //Solution
        double pounds = 200d;
        double kiloGrams = 0.453592337*pounds;
        System.out.println(pounds + " pounds converted to kilogram equals " + kiloGrams + " kg");

        //We can use underscores to represent large doubles
        double hasUnderscores = 234_2323232.3232_2d;
        System.out.println(hasUnderscores);
    }
}
