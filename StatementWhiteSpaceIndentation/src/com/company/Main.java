package com.company;

public class Main {
    public static void main(String[] args) {
        int myVariable = 50; //This following lines are valid Java statements
        myVariable++;
        myVariable--;
        System.out.println("This is a test " + myVariable);

        System.out.println("This is " +      //Multi-line statement
                "another " +
                "valid statement");         //Statement end

        //Multiple statements in one line - This is NOT recommended - Difficult to read
        int anotherVariable = 5;
        anotherVariable--;
        System.out.println("Hello" + anotherVariable);

        //DON'T DO THIS! - Valid but annoying
        int helloWorld
                =
                50;

        //Whitespace -> Good idea to use whitespace and indentation to clarify the structure and readability of your code
        int a = 1;        //Does not look good!
        int b = 2;
        int c = 3;

        int d = 4;      //Whitespace increases clarity!
        int e = 5;
        int f = 6;

        //Indentation -> Allows you to see the logical flow of your code

        //Non-indented code
        if (a < b) {
            System.out.println("NO indentation! Ugly!");
        }

        //Indented code
        if (c < d) {
            System.out.println("Nice indentation!");
        }
    }
}
