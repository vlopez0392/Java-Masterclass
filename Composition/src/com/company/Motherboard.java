package com.company;

public class Motherboard {

    //Composition on the other hand consists of objects that have a HAS-A relationship.
    //e.g. A computer has a case, a motherboard and a monitor but each of these are NOT computers themselves.
    //Composition models the HAS - A relationship

    //Fields
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    //Constructor
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    //Getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    //Other methods
    public void loadProgram(String programName){
        System.out.println("Loading program " + programName + " is now loading");
    }


}
