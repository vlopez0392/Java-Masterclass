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

        if(isOn()){
            double change =  newSpeed - currentSpeed;

            if(change!=0){
                if(isAutomatic()){
                    changeGearsAutomatically(newSpeed, currentSpeed);
                }else{
                    changeGearsManually(currentSpeed, newSpeed);
                }
            }else{
                printIncreaseDecreaseSpeed(change, currentSpeed, newSpeed);
            }

            return newSpeed;
        }else{
            System.out.println("Pressing the gas pedal to no avail, please turn on your car now");
            return 0.0;
        }
    }

    private void changeGearsAutomatically(double speed, double newSpeed){
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

    public void changeGearsManually(double speed,  double newSpeed){

        double change = newSpeed - speed;

        if(!isAutomatic()){
            if(isOn()){
                int currentGear = getCurrentGear(speed);
                printGearAndSpeed(speed, currentGear);

                if(change > 0) {
                    accelerate(speed, newSpeed, currentGear);
                }else{
                    decelerate(speed, newSpeed, currentGear);
                }

                return;

            }else{
                System.out.println("Car is off but you can use the shift stick and clutch to practice changing gears");
                gearChanger(1, speed);
                return;
            }
        }
        System.out.println("Your car is automatic, you cannot change gears manually");
    }

    //User interface to change gears
    private int gearChanger(int currentGear, double speed){
        Scanner scanner = new Scanner(System.in);

        boolean changeGears = true;
        boolean practice = false;

        while(changeGears){

            if(speed ==0){
                System.out.println("Practice mode: ");
                practice = true;
                printGearAndSpeed(speed, currentGear);
            }else{
                System.out.println("Please change gears as required: ");
            }

            //Engage the clutch
            boolean first = true;

            while(first){
                System.out.println("Press 'e' to engage the clutch: ");
                String engage = scanner.nextLine();
                engage = engage.toLowerCase();

                if(engage.equals("e")){
                    toggleClutch(false);
                    first = false;
                }else{
                    System.out.println("Invalid input, Please try again");
                }
            }

            //Select the desired gear - In practice mode you can choose any
            boolean second = true;

            while(second){
                System.out.println("Please change gear now: ");
                boolean isInt = scanner.hasNextInt();

                if(isInt){
                    currentGear = scanner.nextInt();
                    second = false;
                }else{
                    System.out.println("Invalid gear, please try again");
                }

                scanner.nextLine();
            }

            //Disengage the clutch
            boolean third = true;

            while(third){
                System.out.println("Press 'd' to disengage the clutch: ");
                String disengage = scanner.nextLine();
                disengage = disengage.toLowerCase();

                if(disengage.equals("d")){
                    toggleClutch(true);
                    third = false;
                }else{
                    System.out.println("Invalid input, Please try again");
                }
            }

            if(practice){
                System.out.println("Continue with practice? Y/N");
                String choice = scanner.nextLine();

                if(!choice.toLowerCase().equals("y")){
                    System.out.println("Exiting practice mode...");
                }else{
                    continue;
                }
            }
            scanner.close();
            changeGears = false;
        }

        return currentGear;
    }

    //Toggles the clutch
    private boolean toggleClutch(boolean clutchIn){
        if(clutchIn){
            System.out.println("Clutch disengaged");
            return false;
        }else{
            System.out.println("Clutch engaged");
            return true;
        }
    }

    //Accelerate
    private void accelerate(double speed, double newSpeed, int currentGear){  //Assume constant increase in speed
        while (speed <= newSpeed) {
            speed += 1.0;

            int newCurrentGear = getCurrentGear(speed);
            if (newCurrentGear > currentGear) {

                if(isAutomatic()){ //Gear change done automatically
                    System.out.println("Changed gear from: " + currentGear + " to: " + newCurrentGear);
                    currentGear = newCurrentGear;

                }else{ //Deploy GearChanger
                    int requiredGear = -1;

                    while(requiredGear != newCurrentGear){
                        System.out.println("Manual gear change required now, please change gear to: "+ newCurrentGear);
                        requiredGear = gearChanger(currentGear, speed);

                        if(requiredGear == newCurrentGear){
                            System.out.println("Changed gear from: " + currentGear + " to: " + newCurrentGear);
                            currentGear = newCurrentGear;

                        }else{
                            if(requiredGear == currentGear){
                                System.out.println("No action performed, already in gear: "+ currentGear+" . Try again.");
                            }else{
                                System.out.println("Cannot change to that gear now, please try again");
                            }
                        }
                    }
                }

            }else if(newCurrentGear == this.numberOfGears){
                break;
            }
        }
        printGearAndSpeed(newSpeed, currentGear);
    }

    //Decelerate
    private void decelerate(double speed, double newSpeed, int currentGear){ //Assume constant decrease in speed
        while (speed >= newSpeed) {
            speed -= 1.0;
            int newCurrentGear = getCurrentGear(speed);

            if (newCurrentGear < currentGear) {
                if(isAutomatic()){ //Gear change done automatically
                    System.out.println("Changed gear from: " + currentGear + " to: " + newCurrentGear);
                    currentGear = newCurrentGear;

                }else{ //Deploy GearChanger
                    int requiredGear = -1;

                    while(requiredGear != newCurrentGear){
                        System.out.println("Manual gear change required now, please change gear to: "+ newCurrentGear);
                        requiredGear = gearChanger(currentGear, speed);

                        if(requiredGear == newCurrentGear){
                            System.out.println("Changed gear from: " + currentGear + " to: " + newCurrentGear);
                            currentGear = newCurrentGear;
                        }else{
                            if(requiredGear == currentGear){
                                System.out.println("No action performed, already in gear: "+ currentGear+" . Try again.");
                            }else{
                                System.out.println("Cannot change to that gear now, please try again");
                            }
                        }
                    }
                }

            }else if(newCurrentGear == 1){
                if(newSpeed == 0){
                    currentGear = 1;
                    newSpeed = 0;
                }
                printGearAndSpeed(newSpeed, currentGear);
                break;
            }
        }
    }

    //Get current Gear
    private int getCurrentGear(double speed) {
        if (speed <= 0) {
            return 0;
        } else if (speed >= 1 && speed < 10) {
            return 1;
        } else if (speed >= 10 && speed < 25) {
            return 2;
        } else if (speed >= 25 && speed < 50) {
            return 3;
        } else if (speed >= 50 && speed < 85) {
            return 4;
        } else if (speed >= 85 && speed < 100) {
            return 5;
        } else if (speed >= 100){
            if(this.numberOfGears > 5){
                return 6;
            }
        return 5;
        }

        return -1;
    }

    private void printGearAndSpeed(double speed, int currentGear){
        if(speed >0){
            System.out.println("You are now traveling at "+ speed + " in gear number: "+ currentGear);
        }else{
            System.out.println("Car has stopped. Current gear: " + currentGear);
        }
    }

    private void printIncreaseDecreaseSpeed(double change, double currentSpeed, double newSpeed){
        if(change < 0){
            System.out.println("Decreased speed by: " + change + " From: " + currentSpeed + " to: "+ newSpeed);
        }else if (change >0 ) {
            System.out.println("Increased speed by: " + change + " From: " + currentSpeed + " to: " + newSpeed);
        }else{
            System.out.println("No change in speed");
        }
    }
}

