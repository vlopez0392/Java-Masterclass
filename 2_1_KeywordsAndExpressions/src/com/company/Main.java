package com.company;

public class Main {
    public static void main(String[] args) {
	// Java has 57 reserved words which are marked in blue in IntelliJ
    // Expressions --Building blocks of Java Programs --Are built with values, variables, operators
    //and method calls.

    double kilometers = (100*1.609344); //Expression is kilometers = (100*1.609344)

    int highScore =50;   //Expression is highScore = 50

    if(highScore == 50){ //Expression is highScore ==50
        System.out.println("This is an expression");
        }

    //Challenge
    //In the following code, which parts of the code are expressions?

    int score = 100; //score = 100;
    if(score>50){    //score > 50
        System.out.println("You got the high score"); //The String inside the method call
        score = 0; //The whole line - Assignment expression
        }
    }
}
