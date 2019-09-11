package com.company;

public class Main{

    public static void main(String[] args) {
	// Every class in Java inherits from a Java class known as a Object. We can override some methods from this class.
    // Classes automatically extend from java.lang.Object

    Car myCAr = new Car("carTest", 4, true, "Gas", 100, 2000,
            "Green", true, 4,4 , 5);
    myCAr.throttle(10, 100);

    System.out.println();

    myCAr.throttle(50, 1);

    }
}
