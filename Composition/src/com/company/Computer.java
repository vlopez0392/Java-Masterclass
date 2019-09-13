package com.company;

public class Computer {
    //This class is composed of objects that hold a HAS-A relationship with Computer.

    //Fields
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    //Constructor
    public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //Other methods that hide the getters before
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50,"yellow");
    }
}
