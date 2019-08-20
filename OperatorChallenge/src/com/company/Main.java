package com.company;

public class Main {

    public static void main(String[] args) {
	    //Challenge
        // 1. Create a double variable with a value of 20.00
        // 2. Create a second variable of type double with the value 80.00
        // 3. Add both numbers together and multiply by 100.00
        // 4. USe the remainder operator (May be used on doubles) to figure out what the remainder
        // from the result of the operation in step 3 and 40.00.
        // 5. Create a boolean variable that assigns the value true if the remainder in step 4 is zero, otherwise not zero.
        // 6. Output the boolean variable
        // 7. Write an if-then statement that displays the message "Got some remainder" if the
        // boolean in step 5 is not true.

        double a = 20.00;
        double b = 80.00;
        double c = 100*(a+b);

        //Get the remainder
        double r = c%40.00;

        //Test if remainder r is zero
        boolean test = r ==0 ? true : false;
        System.out.println("test result =" +test);

        // Test if there is a remainder
        if(!test){
            System.out.println("Got some remainder: " + r);
        }
    }
}
