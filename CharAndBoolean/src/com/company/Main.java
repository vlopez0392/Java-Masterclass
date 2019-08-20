package com.company;

public class Main {
    public static void main(String[] args) {
	// Char variables
        char myChar = 'D'; // Char only allows you save one character -> Applications: Lets you store the last key pressed by an user.
                           // Lets you store data into arrays
                           // Chars were much more relevant when Java was released due to computer memory saving.

        char unicodeD = '\u0044'; // Chars let you use Unicode characters which let you assign a single number to many international characters and thus use 16 bits of memory.
                                  // Unicode -> International Encoding Standard --> May represent 2**16 characters
        System.out.println(myChar);
        System.out.println(unicodeD);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

    // Booleans              // Booleans may only have two states, true or false. They are extremely useful when using conditional logic.
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);

        boolean isCustomerOver21 = true; // Value may depend on particular customer value
    }
}
