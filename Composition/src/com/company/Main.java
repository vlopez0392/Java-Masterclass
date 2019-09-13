package com.company;

public class Main {

    public static void main(String[] args) {

        //Lets model create the computer components
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27,
                new Resolution(2540, 1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4,6,"v.244");

        //Lets build the Computer
        Computer myComputer = new Computer(theCase, theMonitor, theMotherBoard);

        //We can access the methods of our components directly as follows:
        //myComputer.getMonitor().drawPixelAt(1500, 1200, "Green");
        //myComputer.getMotherboard().loadProgram("Windows 1.0");
        //myComputer.getTheCase().pressPowerButton();

        //Now suppose we don't wan't to the calling program to access the objects directly (e.g. myComputer calling drawPixelAt()
        myComputer.powerUp(); //We include all the previous functionalities in the powerUp() method.

        //Composition creates objects within objects -> Where to use each? -> Try to implement composition first - Adds flexibility
                                                                         //However, which one to apply first is dependent on the problem
                                                                         //in hand.

    }
}
