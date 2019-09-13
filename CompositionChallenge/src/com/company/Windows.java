package com.company;

public class Windows {

    //Fields
    private int numberOfWindows;
    private boolean hasShades;
    private boolean shadesOpen;
    private String frameMaterial;
    private boolean isOpen;

    //Constructor
    public Windows(int numberOfWindows, boolean hasShades, String frameMaterial) {
        this.numberOfWindows = Math.max(0, numberOfWindows);

        if(numberOfWindows > 0){
            isOpen = true;              //Open all windows
            this.hasShades = hasShades;
            if(hasShades){
                this.shadesOpen = true; //Open the shades
            }
        }else{
            this.hasShades  = false;
            this.shadesOpen = false;
        }

        this.frameMaterial = frameMaterial;
    }

    //Getters
    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public boolean hasShades() {
        return hasShades;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public boolean areShadesOpen(){
        return shadesOpen;
    }
    
    //Other methods
    public void openAndCloseShades() { //Opens and closes all window shades regardless of the number of windows
        if (this.hasShades) {
            if(this.shadesOpen){
                System.out.println("Closing shades, it is dark now");
                this.shadesOpen = false;
            }else{
                System.out.println("Opening shades, light enters the room");
                this.shadesOpen = true;
            }
        }else{
            System.out.println("NO shades in these windows");
        }
    }

    public void openAndCloseWindows(){  //Opens all windows
        if(this.numberOfWindows > 0){
            if(this.isOpen){
                System.out.println("Closing Windows");
                this.isOpen = false;

            }else{
                System.out.println("Opening windows");
                this.isOpen = true;
            }
        }else {
            System.out.println("You are in a windowless room");
        }
    }
}
