package com.company;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }


    //We want to override the fly() method in Bird to implement an specific functionality.
    @Override
    public void fly() {
        super.fly(); //Actually has little wings it can use.
        System.out.println("I'm not very good at that. Can I go for a swim instead?");
    }
}
