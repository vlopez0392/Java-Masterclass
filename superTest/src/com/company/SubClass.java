package com.company;

public class SubClass extends SuperClass {
    @Override
    public void printMethod() {
        super.printMethod(); // Calls the method from the parent class
        // printMethod();       // Creates an infinite recursive call! If calling the parent method, do not forget the
                                // super keyword
        System.out.println("Called subClass.printMethod()");
    }
}
