package com.company;

public abstract class Animal {
    private String name; // We can add fields and constructors (Unlike interfaces)

    public Animal(String name) {
        this.name = name;
    }

    //Define the abstract methods - Will lets us define required behaviors without specifying how they ought to be performed.
    //Classes that inherit from the abstract class are forced to implement these methods (Unlike regular inheritance).
    //NOT all methods need be abstract (Unlike interfaces)

    //Methods common to all animals - No need to create an interface since all animals can inherit from the Animal class.
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
