package com.company;

public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    //A car has a IS-A relationship with class Vehicle because a car IS A vehicle.

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }




}
