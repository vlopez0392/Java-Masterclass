package com.company;

public class SpeedConverter {
    //        1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
    //        This method needs to return the rounded value of the calculation of type lon
    //        If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to
    //        Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            return Math.round(kilometersPerHour/1.609);
        }
        return -1;
    }

    //    2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
    //    This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
    //    Then it needs to print a message in the format "XX km/h = YY mi/h".

    //    XX represents the original value kilometersPerHour.
    //    YY represents the rounded milesPerHour from the kilometersPerHour parameter.

    // If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0) {
            long mph = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour+" km/h = "+mph+" mi/h");
            return;
        }
        System.out.println("Invalid Value");
    }
}
