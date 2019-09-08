package com.company;

public class Animal {
    //Lets create a basic Animal class to demonstrate the shared characteristics between animals and by consequence
    //create other classes with some inherited characteristics from the Animal class.

    //Animal will be the base class in which the rest of the animals will base themselves on

    //Fields -> States that every animal has
    private String name;
    private int brain;
    private int body;
    private int weight;
    private int size;

    //Constructor
    public Animal(String name, int brain, int body, int weight, int size) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    //Lets introduce some basic behaviors common to all Animals (Functionality is not essential for now):
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at: " + speed);
    }
}
