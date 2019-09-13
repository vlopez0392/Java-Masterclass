package com.company;

public class Main{

    public static void main(String[] args) {
	// Every class in Java inherits from a Java class known as a Object. We can override some methods from this class.
    // Classes automatically extend from java.lang.Object

    Car myCar = new Car("carTest", 4, true, "Gas", 100, 2000,
            "Green", true, 4,4 , 6);
    myCar.throttle(200, 0);

    System.out.println();

    myCar.throttle(50, 1);

    System.out.println();

    Car myOtherCar = new Car("carTest2", 4, false, "Gas", 100, 2000,
                "Green", true, 4,4 , 6);

    //myOtherCar.changeGearsManually(0, 0);

    myOtherCar.steer(10);
    myOtherCar.throttle(50, 10);



    }
}
