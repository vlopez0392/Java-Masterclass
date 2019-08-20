package com.company;

public class Main {
    public static void main(String[] args) {
	    // Strings - NOT a primitive type / A Class. A sequence of characters.
        // Number of characters limited by Integer.MAX_VALUE or around 2.14 billion
        String myString = "This is a string!";
        System.out.println("My string is equal to = " + myString);
        myString = myString + " , and this is more ";
        System.out.println("My string is equal to = " + myString);

        //We can also use Unicode Characters
        myString = myString + '\u00A9' + " 2019";
        System.out.println("My string is equal to = " + myString);

        //Numeric Strings do not follow the numeric type operations! String concatenation is performed!
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        // Ints and other primitive types are converted to String when concatenated with other String Types!
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is " + lastString);

        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println("LastString is " + lastString);

        // Strings are immutable. Changing strings implies the creation of a new String.
        // String Buffers can be used to achieve what we did in the above examples.
        // String Buffers are somewhat like mutable Strings.
    }
}
