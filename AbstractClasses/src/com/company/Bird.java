package com.company;

public abstract class Bird extends Animal implements CanFLy{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Breathe in, breathe out, repeat");
    }

    //Lets add another abstract method -> Fly() -> Not all birds can fly so we define this class as abstract so individual
                                                // bird objects can implement as they require.
    //public abstract void fly(); -> See reasons for disabling this method in the notes in Main.java
    @Override
    public void fly() {
        System.out.println( getName() + " its flapping its wings");
    }
}
