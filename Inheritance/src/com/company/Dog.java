package com.company;

public class Dog extends  Animal{
    //We use the extends keyword to access the states and behaviors of the class from which we inherit from.
    //Dog inherits from base class Animal.

    //Dog Fields
    //We can now add more states and behaviors that are unique to a Dog and not necessary applicable to an animal
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //We must define a default constructor whenever we inherit from a class, like so:
    //The Dog class must have a constructor that calls the constructor from the Animal class

    public Dog(String name, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, weight, size); //The super keyword calls the constructor of the base Animal class.
                                                    //Some parameters have a default state (e.g. brain and body in a dog)
                                                    //The super call here is mandatory.
        this.eyes =  eyes;
        this.legs =  legs;
        this.tail =  tail;
        this.teeth = teeth;
        this.coat  = coat;
    }

    //We can also override class behaviors (methods) from the Animal class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();    //Call the super.method() equivalent of the base class
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    public void walk(){     //move() will always be called from the super class (DO NOT look in the current class)
                            //Using the super.method() will achieve this
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10); //It is recommended not to use a super call here in case we want to
                        // override the move() method in the future.
    }

    @Override
    public void move(int speed) { //Executed first because we created move() in the Dog class
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);  //The super call here is optional!
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    //Every Java class you create extends the Object class
    //You can keep extending as much as required. However, with experience, one can define the
    //depth of such extensions.
}
