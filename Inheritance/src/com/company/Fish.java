package com.company;

public class Fish extends Animal{
    //Fields
    private int gills;
    private int eyes;
    private int fins;

    //Constructor
    public Fish(String name, int weight, int size, int gills, int eyes, int fins) {
        super(name, 1, 1, weight, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    //Other methods
    private void rest(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }



}
