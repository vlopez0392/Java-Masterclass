package com.company;

public class Door {

    //Fields
    private String color;
    private String material;
    private boolean isOpen;

    //Constructor
    public Door(String color, String material, boolean isOpen) {
        this.color = color;
        this.material = material;
        this.isOpen = isOpen;
    }

    //Getters
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return isOpen;
    }

    //OtherMethods
    public void openCloseDoor(){
        if(this.isOpen){
            System.out.println("Closing door");
            this.isOpen = false;
        }else{
            System.out.println("Opening the door");
            this.isOpen = true;
        }
    }

}
