package com.company;

public class Main {

    public static void main(String[] args) {
        // Parsing values from a String -> Converting a string into another data type (e.g. number string to int or long
        // Uses of parsing -> When reading input from a user / or input into a UX

        String numberAsString = "2019"; //Not a number!
        System.out.println("NumberAsString = "+ numberAsString);

        //How to convert numberAsString into a number? ->Use a parsing method to convert
        //the String into any other primitive type.

        int number = Integer.parseInt(numberAsString); //Parsing method parseInt()
                                                       //Integer is a Wrapper class -> Contains many useful static methods
                                                       //parseInt is one of such methods ->Converts a String into an int
                                                       //If conversion fails we will get an exception
        long longNumber = Long.parseLong(numberAsString); //Similarly for Long

        System.out.println("Number = "+ number);
        System.out.println("Long number = "+ longNumber);

        //Parsing is useful when calculations are required
        //Example

        numberAsString += 1; //1 is converted into a String and will be concatenated
        number += 1;         //In there the expression works as expected

        System.out.println("NumberAsString = "+ numberAsString); //Not the behavior we wanted
        System.out.println("Number = "+ number);
        System.out.println("Long number = "+ longNumber);

        //Conversion failure exception -> Arises when there is a wrong input -> Must be handled by an exception handler
                                                                           //-> May also be handled with our own methods

        //We may use other data types!

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Double number = "+ doubleNumber);

        String doubleAsString = "2019.4";
        doubleAsString += 1;
        doubleNumber += 1.23;

        System.out.println("doubleAsString = "+ doubleAsString);    //Again, not the behavior we expect.
        System.out.println("Double number = "+ doubleNumber);
    }
}
