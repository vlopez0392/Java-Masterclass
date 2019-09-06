package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;   //The private access modifier prevents the classes outside Class to modify this field
    private String engine;  //We use a set method instead
    private String color;

    public void setModel(String model){ //Sets the model field for the Car instance
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){ //Getters and setters allow us to perform validation!
                                       //The equals() method allows us to check for object equality. In this case String
            this.model = model;        //Use the "this" keyword to update the field model to the given parameter model

        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){          //Defines the getter method
        return this.model;
    }
    //Classes allows you to define the rules that will define your objects, external users need to abide to such rules
    //when creating objects defined by your class -> Concept of Encapsulation
}
