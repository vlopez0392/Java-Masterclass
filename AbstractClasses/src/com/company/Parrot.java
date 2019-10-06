package com.company;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    //We only need to override the fly method since the Bird class already overrides the breathe() and eat() methods.
    //from the Animal superclass.
//    @Override
//    public void fly() {
//        System.out.println("Flitting from branch to branch");
//    }
}
