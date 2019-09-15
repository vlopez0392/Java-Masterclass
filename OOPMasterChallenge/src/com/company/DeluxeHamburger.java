package com.company;

public class DeluxeHamburger extends Hamburger {
    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.

    //Fields
    private double chipsAndDrinkPrice;

    //Constructor
    public DeluxeHamburger( String rollType, String meatType ,double BurgerPrice) {
        super("DeluxeBurger", rollType, meatType, BurgerPrice);
        this.chipsAndDrinkPrice = 50;
    }

    //Getters
    public double getChipsAndDrinkPrice() {
        return chipsAndDrinkPrice;
    }

    //Other methods
    @Override
    public void showGrandTotal() {
        super.showGrandTotal();
        System.out.println("Deluxe Burger extras");
        System.out.println("Chips and Drink price: " + + getChipsAndDrinkPrice());
        System.out.println("Grand Total $: " + calculateBurgerPrice());
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    @Override
    public void addBaseItems(int onions, int tomatoes, int pickles, int lettuce) {
        super.addBaseItems(0,0,0,0);
        System.out.println("Additions are not allowed here ");
    }

    @Override
    public double calculateBurgerPrice() {
        return calculateBaseBurgerPrice() + getChipsAndDrinkPrice();
    }
}
