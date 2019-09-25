package com.company;

public class Main {

    public static void main(String[] args) {
	// Interfaces specify methods that a particular class that implements the interface must implement.

    //The interface is abstract ->No actual code in the methods. You only supply the method signatures. The functionality is
    //determined by the class implementing the  interface.

    //Interfaces -> Provides a common behavior used by several classes that implement the interface.

    //
    ITelephone vicksPhone; //Declaring an interface reference -> You cannot instantiate an Interface
                           //Implementing classes can be instantiated with a variable currently pointing to the Interface.

    //Polymorphism at its best!
    vicksPhone = new DeskPhone(123456);
    vicksPhone.powerOn();
    vicksPhone.callPhone(123456);
    vicksPhone.answer();

    vicksPhone = new MobilePhone(24565);
    vicksPhone.powerOn();
    vicksPhone.callPhone(24565);
    vicksPhone.answer();
    }
}
