package com.company;

public class Main {

    public static void main(String[] args) {
        double cmTest1 = calcFeetAndInchesToCentimeters(13, 6); //411.48 cm
        System.out.println(cmTest1);

        double cmTest2 = calcFeetAndInchesToCentimeters(162); //411.48 cm
        System.out.println(cmTest2);
    }
    // Challenge

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters
    // feet is the first parameter, inches is the second parameter

    //You should validate that the first parameter feet >=0
    //You should validate that the 2nd parameter inches >=0 amd <=12
    //return -1 from the method if either of the above is not true

    //If the parameters are valid, then calculate how many centimeters
    //comprise the feet and inches passed to this method and return that
    //value.

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >=0 && (inches>=0 && inches <=12)){
            return 2.54*(feet*12 + inches);
        }
        return -1;
    }

    // Create a 2nd method of the same name but with one parameter, inches.
    // Validate that it is >=0
    // return -1 if it is not true
    // Call the overloaded method and pass in the correct number of feet as calculated
    // in this method.

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            return calcFeetAndInchesToCentimeters(Math.floor(inches/12), inches%12);
        }
        return -1;
    }
}
