package com.company;

public class Room {


    private Windows windows;
    private Door door;
    private Lamp myLamp;

    //Constructor
    public Room(Windows windows, Door door, Lamp myLamp) {
        this.windows = windows;
        this.door = door;
        this.myLamp = myLamp;
    }

    //Provide Getters only for Windows and Door
    public Windows getWindows() {
        return windows;
    }

    public Door getDoor() {
        return door;
    }

    //Control the lamp with other methods
    public void powerLampOn(){
        boolean lampStatus = myLamp.isOn();

        if(!lampStatus){    //Turn on the lamp
            myLamp.toggleLamp(lampStatus);
        }else{
            System.out.println("Lamp is already on!");
        }
        myLamp.setLightIntensity();
    }

    public void powerLampOff(){
        boolean lampStatus = myLamp.isOn();

        if(lampStatus){ //Turn off the lamp
            myLamp.toggleLamp(lampStatus);
        }else{
            System.out.println("Lamp is already off");
        }
    }
}
