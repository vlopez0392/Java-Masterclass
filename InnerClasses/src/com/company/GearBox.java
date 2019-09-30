package com.company;
import java.util.ArrayList;

// 2- Non-static nested classes or inner classes ->
//      - Quite useful. Used when it makes sense to refer to the outer class only. The inner class is referred only in
//      the context of its outer class.

//      - Instances of the inner class has access to all fields and methods of its outer class, even those marked as
//      private.

//      - It is recommended not to use the same field names in both the inner and outer classes -> Shadowing will occur.
//      Then, to refer to a field of the outer class we must use OuterClass.fieldName which is cumbersome.

//      - Inner classes can only be created with an instance of its outer class.
//      To achieve this we do the following: OuterClass.InnerClass variableName = referenceToOuterClass.new InnerClass();

//      - Often, the inner class will be private. Any instances of the inner class will be instantiated by the outer class.

//      - Inner classes improve encapsulation.

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < this.maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    //Add Gear should go in the constructor -> Must build the gearbox when we instantiate the GearBox
    private void addGear(int number, double ratio) {
        if ((number > 0) && (number <= this.maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * this.gears.get(currentGear).getRatio();
    }

    //Inner class -> No sense to refer to a Gear without a GearBox.
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}