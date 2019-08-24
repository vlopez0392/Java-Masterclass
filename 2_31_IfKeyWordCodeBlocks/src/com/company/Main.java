package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) { //Braces are optional for one-line if statements
            System.out.println("Your score was 5000");
        }

        if (score == 4000) { //Removing the code blocks for this if-then statement will result in the second print being executed anyhow
            System.out.println("Again, your score was 4000");
            System.out.println("This should not be executed for any scores other than 4000");
        }

        //It is recommended to always use code blocks in if-then statements.
//        //if-then-else
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here! Woo your score is at least 5000");
//        }

        if( gameOver){ //Variables outside this code block are in scope in the code block
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was "+ finalScore);
        }

        //int savedFinalScore = finalScore; // finalScore is out of scope here!

        //Challenge
        //Print out a second score on the screen with the following
        //Score set to 10000
        //level completed set to 8
        //bonus set to 200
        //But make sure the first printout still displays as well


        //DO NOT create new variables --> Incurs in duplication of code which is never recommended!
        //Methods will help us avoid code duplication!
        score = 10000;
        levelCompleted = 8 ;
        bonus = 200;

        if(gameOver){ //Variables outside this code block are in scope in the code block
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score is " + finalScore);
        }


    }
}
