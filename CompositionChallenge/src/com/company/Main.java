package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Windows windows = new Windows(3,true,"Metal");
        Door door = new Door("Brown", "Wood", true);
        Lamp myLamp = new Lamp(true, "Blue", "Philips");

        Room myRoom = new Room(windows, door, myLamp);

        //Open and close the windows, shades and door
        myRoom.getWindows().openAndCloseWindows();
        myRoom.getWindows().openAndCloseWindows();

        System.out.println();

        myRoom.getWindows().openAndCloseShades();
        myRoom.getWindows().openAndCloseShades();

        System.out.println();

        myRoom.getDoor().openCloseDoor();
        myRoom.getDoor().openCloseDoor();

        System.out.println();

        //Power off the lamp
        myRoom.powerLampOff();

        //Try to power it off again
        myRoom.powerLampOff();

        //Power Lamp On
        myRoom.powerLampOn();

        //Try to power it on again
        myRoom.powerLampOn();

    }
}
