package com.company;

public class Main {

    public static void main(String[] args) {
	boolean test1 = BarkingDog.shouldWakeUp(true,5); //Shut up... Throws Shoe!!!
    System.out.println(test1);

    boolean test2 = BarkingDog.shouldWakeUp(false,8); //Zzzzzz...
    System.out.println(test2);

    boolean test3 = BarkingDog.shouldWakeUp(true, 12); //I'm already awake
    System.out.println(test3);
    }
}
