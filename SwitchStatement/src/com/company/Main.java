package com.company;

public class Main {

    public static void main(String[] args) {
	    //Motivating example: Consider the following:

        //THe if-then statement has a lot of flexibility
        int value =1;
        if(value == 1){
            System.out.println("Value was 1");
        }else if(value ==2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Value was neither 1 nor 2");
        }
        //The above can get very messy if you have ten cases to consider & test.
        //The alternative is using the switch statement:

        int switchValue = 4;

        //Very useful to test several possible values for a variable
        switch(switchValue){
            case 6: //Equivalent to if(value ==1)
                System.out.println("Value was 1");
                break; //Terminates the switch statement and passes control
                       //to the line after the switch block
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5: //You can test multiple cases in the same line
                System.out.println("Was a 3, 4, or a 5");
                System.out.println("Actually it was a "+switchValue);
                break;  //Not including the break statement can yield unpredictable results.
                        //Output will continue until it finds a break statement.

            default:    //Any other case not covered above.
                System.out.println("Value was neither 1 nor 2");
                break; //This break is not necessary but it is recommended to include it.
        }
        //After switch breaks, the control in passed on to the lines below:

        //Challenge
        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display a message if any of these are found and then break
        // Add a default which displays a message saying not found


        //JDK 7 introduced the ability of using switch statements with Strings. Notice that when using Strings, test cases are case-sensitive.
        //Use the String.toLowerCase() method in the switch argument to convert strings to lower case and test all possible cases.
        char switchTest = 'G';

        switch(switchTest){
            case 'A':
                System.out.println("Found an A");
                break;
            case 'B':
                System.out.println("Found a B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchTest + " was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
