package com.company;

public class Main {
    public static void main(String[] args){

        //We will write a method to avoid the duplicated code in the previous lesson
        calculateScore(800, 5, 100, true);

        //You can pass the arguments without defining them first. They can be passed directly wit literals as follows::
        calculateScore(10000, 8, 200, true);
    }
    //First Method
    //Methods must be outside other method definitions but must reside inside the class definition (if its in the same class)

    //Define the method - access modifier static? return type name(parameters)
    private static int calculateScore(int score, int levelCompleted, int bonus, boolean gameOver){

        if(gameOver){ //Variables outside this code block are in scope in the code block
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        return -1; // A value must be sent back even if gameOver is NOT true. ALl program variations must be accounted for.
                   // Usually -1 is returned when the method call is
    }
    // void -Method does not return anything
    // If we want to return something, use the desired data type instead.
}
