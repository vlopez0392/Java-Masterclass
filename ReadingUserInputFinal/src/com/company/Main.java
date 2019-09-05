package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //We need to add some validation code over here to handle the appropriate data types and ranges
        System.out.println("Enter your year of birth: ");

        //Handling the appropriate data type
        boolean hasNextInt = scanner.hasNextInt();  //hasNextInt() checks if the input entered is an integer
                                                    //returns true if an int is input, false otherwise

        if(hasNextInt){ //Proceed with the rest of the code if an int is input
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            //Handling the age range
            int age = 2019 - yearOfBirth;
            if(age >= 0 && age<= 100){
                System.out.println("Your name is: "+name + " and you are " + age + " years old");
            }else{
                System.out.println("Invalid Year of Birth");
            }
        }else { //Handles the input error
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
