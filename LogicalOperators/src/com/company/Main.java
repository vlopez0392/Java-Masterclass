package com.company;

public class Main {
    public static void main(String[] args) {
         //Review of if-then
         int topScore = 80;
	     if(topScore == 100){
             System.out.println("You got the highest score!!");
         }

	     //Using the AND operator
        int secondTopScore = 95; //Logical AND && - Bitwise AND &
	    if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater the second topScore and less than 100!");
        }

	    //Using the OR operator
        if( (topScore > 90) || (secondTopScore <= 90) ){ //Logical OR ||  - Bitwise OR |
            System.out.println("Either or both of the conditions are true!");
        }

        //Challenge
         int newValue = 50;
         if (newValue == 50){  //Always use the comparison operator == instead of an assignment operator =
             System.out.println("This is not an error!!!");
         }

         //Example
         boolean isCar = false;
         if (!isCar) {  //If using an assignment operator '=' then isCar becomes true and the code block is executed
             System.out.println("This is not supposed to happen!!!");
         }

         //! NOT operator -> Logical Complement operator
         // It tests the alternate value.
         // Recommended -> Using abbreviated form !isCar or equivalently isCar

         //Ternary operator

         //The ternary operator is a shortcut to assigning one of the two values to a variable
         //depending on a given condition

        //Is a shortcut to the if-then-else statement

        //Example 1
         isCar = true;
         boolean wasCAr = isCar ? true : false; //condition? true:false

         if(wasCAr){
             System.out.println("wasCar is true");
         }

        //Example 2
        int ageOfClient = 20;

        boolean isEighteenOrOver = ageOfClient ==20 ? true:false;
        System.out.println(isEighteenOrOver);
    }
}
