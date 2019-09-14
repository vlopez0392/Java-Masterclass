package com.company;

import java.util.Scanner;

public class Lamp {

    //Fields
    private boolean isOn;
    private String color;
    private String manufacturer;

    //Constructor
    public Lamp(boolean isOn, String color, String manufacturer) {
        this.isOn = isOn;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    //Methods
    public boolean isOn() {
        return isOn;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    //Other methods
    public boolean toggleLamp(boolean isOn){
        if(isOn){
            System.out.println("Turned lamp off");
            this.isOn = false;
        }else{
            System.out.println("Turned lamp On");
            this.isOn = true;
        }
        return this.isOn;
    }

    public void setLightIntensity(){
        boolean keepSetting = true;

        while(keepSetting) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Set your intensity level: 1,2 or 3");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int setChoice = scanner.nextInt();

                if(setChoice >= 1 && setChoice <=3){
                    System.out.println("Light Intensity set to: "+setChoice);
                    scanner.close();
                    keepSetting = false;
                }else{
                    System.out.println("No such intensity level, please try again");
                }
            }
        }

    }
}
