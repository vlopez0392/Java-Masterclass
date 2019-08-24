package com.company;

public class Main {
    public static void main(String[] args) {

        //If-then statement -> Most basic of all the control flow statements in Java
        //It tells your program to execute a certain section of code only if a particular test evaluates to true.

        // Conditional logic -> Uses specific statements in Java to allow us to execute certain code based on whether the
        // condition (the expression) is true or false

	    boolean isAlien = true;
	    if (isAlien == false){ //Always use code blocks {} even if only using one statement
            System.out.println("It is not an Alien");
        }else{
            System.out.println("It is an Alien! RUN!!!!");
        }
    }
}
