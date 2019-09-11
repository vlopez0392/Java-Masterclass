package com.company;

public class Vehicle {
    // Challenge.
    // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of Car that inherits from the Car class.
    // You should be able to hand steer, change gears, and move (speed in other words).
    // You will want to decide where to put the appropriate state and behaviours (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For you specific type of vehicle you will want to add something specific for that type of car.

    //Fields
    private String name;
    private int numberOfPassengers;
    private boolean isAutomatic;
    private String fuelType;
    private int size;
    private int weight;
    private String color;
    private boolean isOn;

    //Constructor
    public Vehicle(String name, int numberOfPassengers, boolean isAutomatic, String fuelType, int size, int weight,
                   String color, boolean isOn) {
        this.name = name;
        this.numberOfPassengers = numberOfPassengers;
        this.isAutomatic = isAutomatic;
        this.fuelType = fuelType;
        this.size = size;
        this.weight = weight;
        this.color = color;
        this.isOn = isOn;
    }

    //Get car state

    public boolean isOn() {
        return isOn;
    }

    //Other characteristics
    public int steer(int steerAngle){
        System.out.println("Vehicle.steer() called");
        return 0;
    }

    public double throttle(double newSpeed, double currentSpeed){
        System.out.println("Vehicle.throttle () called ");
        return 0.0;
    }

    public boolean isAutomatic(){
        return this.isAutomatic;
    }
}
