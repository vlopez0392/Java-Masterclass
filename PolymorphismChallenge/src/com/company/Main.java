package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = generateCar();

        System.out.println("Car specs: " + car1.getSpecs());
        car1.startEngine();
        car1.accelerate();
        car1.brake();
    }

    private static Car generateCar(){
        int carNo = (int) (Math.random()*3) +1;

        switch(carNo){
            case 1:
                return new ToyotaCamry();
            case 2:
                return new NissanGTR();
            case 3:
                return new FordMustang();
        }

        return null;
    }
}

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car{

    //Fields
    private int Cylinders;
    private String name;
    private int wheels;
    private boolean engine ;

    //Constructor
    public Car(int cylinders, String name) {
        Cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    //Getters
    public int getCylinders() {
        return Cylinders;
    }

    public String getName() {
        return name;
    }

    //Other methods
    public void accelerate(){
        System.out.println("Now accelerating your " + getName());
    }

    public void startEngine(){
        System.out.println("Started engine");
    }

    public void brake(){
        System.out.println("Now braking your " + getName());
    }

    public String getSpecs(){
        return "No specs here";
    }
}

class ToyotaCamry extends Car{
    public ToyotaCamry() {
        super(4, "Toyota Camry");
    }

    @Override
    public String getSpecs() {
        return "Model: " + getName() + " Number of Cylinders: " + getCylinders();
    }
}

class NissanGTR extends Car{
    public NissanGTR() {
        super(6, "Nissan GTR");
    }

    @Override
    public String getSpecs() {
        return "Model: " + getName() + " Number of Cylinders: " + getCylinders();
    }
}

class FordMustang extends Car{
    public FordMustang() {
        super(8, "Ford Mustang");
    }

    @Override
    public String getSpecs() {
        return "Model: " + getName() + " Number of Cylinders: " + getCylinders();
    }
}