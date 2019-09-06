package com.company;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
        //porsche.model = "Carrera"; //private access modifier prevents you to do this
        porsche.setModel("Carrera"); //We us the set method instead

	    //If we don't properly initialize our objects, exceptions will occur:
        Car BMW = new Car();       //Recall that objects are initialized with the new keyword
        BMW.setModel("X5");

        //Let's try our get method
        System.out.println(BMW.getModel());

        //What would happen if we try to get a field that has not been set? e.g.:
        Car Holden = new Car();
        System.out.println(Holden.getModel()); // This returns null -->Internal default state for String and Object fields

        Holden.setModel("Commodore");          //Set the model
        System.out.println(Holden.getModel()); //Now, this will output the set model "Commodore"

        Holden.setModel("911");
        System.out.println(Holden.getModel()); //Validation in action! Unknown will be returned.

    }
}
