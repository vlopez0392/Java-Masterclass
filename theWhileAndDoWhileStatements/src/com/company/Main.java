package com.company;

public class Main {
    public static void main(String[] args) {

        // While/do-while -> Sometimes we want to loop until a certain expression evaluates
        // to false. --> We don't know how many times we want to loop

        //Example #1
        int count = 1; //We need to create the counting mechanism beforehand
        while(count !=6){
            System.out.println("Count value is: "+ count);
            count++;    //Count value is updated manually and not automatically
        }
        //Equivalent for loop
        for(count = 1; count < 6; count++){
            System.out.println("Count value is: "+ count);
        }

        //Example #2
        //We can write the while loop as follows too:

        count = 1;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count value is "+ count);
            count++; //Count value must be updated in order to break out of the loop
        }

        //Example #3
        //do-while is always executed at least once
        //do-while is used less often but it has many purposes!

        count = 3;
        do{
            System.out.println("Count value was "+count);
            count ++;
            if(count > 100){
                break;
            }
        }while(count != 6); // Initializing count = 6 creates an infinite loop
                            // count is increased in count++ before the condition is evaluate

        //Challenge #2
        // Modify the while code below
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // At the end, display the total number of even numbers found

        //Challenge code
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;

        while(number < finishNumber){
            if(!isEvenNumber(number)){
                number ++;
                continue; //Passes control to the loop evaluation expression
                          //Allows loop to continue and bypasses the remaining code
            }
            System.out.println("Even number: " + number);
            evenCount++;

            if(evenCount >= 5){
                System.out.println("Total number of even numbers found: " +evenCount);
                break;
            }
            number ++;
        }
    }
    // Challenge #1
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false

    public static boolean isEvenNumber(int number){
        return number%2 == 0 ;
    }
}
