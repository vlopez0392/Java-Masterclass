package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie", 20, 8, 4, 4,1,20, "long silky" );

        //Lets use the inherited methods from the Animal Class:
        dog.eat();
        dog.walk();
        dog.run();
    }
}
