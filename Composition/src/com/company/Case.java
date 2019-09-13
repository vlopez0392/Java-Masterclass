package com.company;

public class Case {

    //Fields
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;


    //Constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    //Other methods
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    //Getters

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
