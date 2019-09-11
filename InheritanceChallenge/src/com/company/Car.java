package com.company;

import java.util.Scanner;

public class Car extends Vehicle{

    private int numberOfDoors;
    private int motorSize;
    private int numberOfGears;

    public Car(String name, int numberOfPassengers, boolean isAutomatic, String fuelType, int size, int weight,
               String color, boolean isOn, int numberOfDoors, int motorSize, int numberOfGears) {

        super(name, numberOfPassengers, isAutomatic, fuelType, size, weight, color, isOn);
        this.numberOfDoors = numberOfDoors;
        this.motorSize = motorSize;

        if(numberOfGears >= 5 && numberOfGears <= 6){
            this.numberOfGears = numberOfGears;
        }else{
            this.numberOfGears = 5;
        }
    }

    //Moving functionality
    @Override
    public int steer(int steerAngle) {
        super.steer(steerAngle);

        if(steerAngle < -180 || steerAngle > 180){
            System.out.println("Invalid steering angle");
            return -1;
        }else{
            if(steerAngle == 0){
                System.out.println("Maintaining course");
            }else if(steerAngle < 0){
                System.out.println("Steering left at  " + steerAngle + " degrees");
            }else{
                System.out.println("Steering right at " + steerAngle + " degrees");
            }

            if(steerAngle ==-180 || steerAngle ==180){
                System.out.println("Now going in reverse");
            }
            return steerAngle;
        }
    }

    @Override
    public double throttle(double currentSpeed, double newSpeed) {
        super.throttle(newSpeed, currentSpeed);
        boolean isOn = isOn();

        if(isOn){
            double change =  newSpeed - currentSpeed;

            if(isAutomatic()){
                changeGearsAutomatically(newSpeed, currentSpeed);
            }else{
                changeGearsManually(currentSpeed, newSpeed);
            }

            printIncreaseDecreaseSpeed(change, currentSpeed, newSpeed);
            return newSpeed;
        }
        System.out.println("Pressing the gas pedal to no avail, please turn on your car now");
        return 0.0;
    }

    private void changeGearsAutomatically(double newSpeed, double speed){
        int currentGear = getCurrentGear(speed);

        System.out.println("Your car has automatic transmission and gears will change automatically");
        printGearAndSpeed(speed, currentGear);

        double change = newSpeed - speed;

        System.out.println("Changing gears... ");
        if(change > 0) {
            accelerate(speed, newSpeed, currentGear);
        }else{
            decelerate(speed, newSpeed, currentGear);
        }
    }

    public void changeGearsManually(double speed, double newSpeed){

        if(isAutomatic()){
            if(isOn()){
                int currentGear = getCurrentGear(speed);
                printGearAndSpeed(speed, currentGear);

            }else{
                System.out.println("Car is off but you can use the shift stick and clutch to practice changing gears");

            }
        }
        System.out.println("Your car is automatic, you cannot change gears manually");
    }

    private void accelerate(double speed, double newSpeed, int currentGear){  //Assume constant increase in speed
        while (speed <= newSpeed) {
            speed += 1.0;

            int newCurrentGear = getCurrentGear(speed);

            if (newCurrentGear > currentGear) {
                System.out.println("Changed gear from: " + currentGear + " to: " + newCurrentGear);
                currentGear = newCurrentGear;

            }else if(newCurrentGear == this.numberOfGears){
                printGearAndSpeed(newSpeed, currentGear);
                break;
            }
        }
    }

    private void decelerate(double speed, double newSpeed, int currentGear){ //Assume constant decrease in speed
        while (speed >= newSpeed) {
            speed -= 1.0;

            int newCurrentGear = getCurrentGear(speed);

            if (newCurrentGear < currentGear) {
                System.out.println("Changed gear from: " + currentGear + " to: " + newCurrentGear);
                currentGear = newCurrentGear;

            }else if(newCurrentGear == 1){

                if(newSpeed == 0){
                    currentGear = 0;
                    newSpeed = 0;
                }

                printGearAndSpeed(newSpeed, currentGear);
                break;
            }
        }
    }

    private boolean toggleClutch(boolean clutchIn){
            if(clutchIn){
                System.out.println("Clutch disengaged");
                return false;
            }else{
                System.out.println("Clutch engaged");
                return true;
            }
    }


    private int getCurrentGear(double speed) {
        if (speed <= 0) {
            return 0;
        } else if (speed > 1 && speed <= 10) {
            return 1;
        } else if (speed > 11 && speed <= 25) {
            return 2;
        } else if (speed > 25 && speed <= 50) {
            return 3;
        } else if (speed > 50 && speed <= 85) {
            return 4;
        } else if (speed > 85) {
            if (this.numberOfGears < 6) {
                return 5;
            }
        }
        return -1;
    }

    private void printGearAndSpeed(double speed, int currentGear){
        if(speed >0){
            System.out.println("You are now traveling at "+ speed + " in gear number: "+ currentGear);
        }else{
            System.out.println("You have stopped your car and your current gear is neutral"  );
        }
    }

    private void printIncreaseDecreaseSpeed(double change, double currentSpeed, double newSpeed){
        if(change < 0){
            System.out.println("Decreased speed by: " + change + " From: " + currentSpeed + " to: "+ newSpeed);
        }else{
            System.out.println("Increased speed by: " + change + " From: " + currentSpeed + " to: "+ newSpeed);
        }
    }
}

