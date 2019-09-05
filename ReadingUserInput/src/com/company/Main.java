package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create an interactive application where the user will be able to input his/her name and year of birth.
    // The application will then output the current age of the user

    //Scanner class -> Is able to parse both primitive types and Strings (Uses methods such as parseInt internally)

        Scanner scanner = new Scanner(System.in); //System.in allows you type input into the console
                                                  //new Keyword -> USed to create a new instance of a Scanner (object)

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt(); // nextInt() parses the input String into an integer

        scanner.nextLine(); //Called to handle the Enter key press after calling nextInt()
                            // -> Enter key is interpreted as input, specifically as a line separator

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();  //Returns a String and lets us save the returned value in a variable

        int age = 2019 - yearOfBirth;
        System.out.println("Your name is: "+name + " and you are " + age + " years old");

        scanner.close(); //Scanner must be closed after it is used.
                         //Calling Scanner methods after closing it will cause errors.
    }
}
