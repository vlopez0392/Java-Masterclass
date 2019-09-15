package com.company;

public class Hamburger {
    // The purpose of the application is to help a fictitious company called Bills Burgers to manage
    // their process of selling hamburgers.
    // Our application will help Bill to select types of burgers, some of the additional items (additions) to
    // be added to the burgers and pricing.
    // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.
    // Each one of these items gets charged an additional price so you need some way to track how many items got added
    // and to calculate the final price (base burger with all the additions).
    // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
    // Create a Hamburger class to deal with all the above.
    // The constructor should only include the roll type, meat and price, can also include name of burger or you
    // can use a setter.

    // All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.

    //Fields
    private String burgerName;
    private String rollType;
    private String meatType;
    private int onions   = 0;
    private int tomatoes = 0;
    private int pickles  = 0;
    private int lettuce  = 0;

    private double pricePerOnion;
    private double pricePerTomato;
    private double pricePerPickle;
    private double pricePerLettuce;

    private double burgerPrice;

    //Constructor
    public Hamburger(String burgerName, String rollType, String meatType ,double burgerPrice){
        this.burgerName = burgerName;
        this.rollType =   rollType;
        this.meatType =   meatType;
        this.burgerPrice = burgerPrice;
        this.pricePerOnion =   5.5;
        this.pricePerTomato =  5.5;
        this.pricePerPickle =  6.5;
        this.pricePerLettuce = 3.5;
    }

    //Getters
    public String getBurgerName() {
        return burgerName;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    //Additional Items and Prices
    public int getOnions() {
        return onions;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public int getPickles() {
        return pickles;
    }

    public int getLettuce() {
        return lettuce;
    }

    public double getPricePerOnion() {
        return pricePerOnion;
    }

    public double getPricePerTomato() {
        return pricePerTomato;
    }

    public double getPricePerPickle() {
        return pricePerPickle;
    }

    public double getPricePerLettuce() {
        return pricePerLettuce;
    }

    //Add additional items
    public void addBaseItems(int onions, int tomatoes, int pickles, int lettuce) {
        this.onions   +=  Math.max(0, onions);
        this.tomatoes +=  Math.max(0,tomatoes);
        this.pickles  +=  Math.max(0,pickles);
        this.lettuce  +=  Math.max(0,lettuce);
    }

    //Calculate Burger Price
    public double calculateBaseBurgerPrice(){
        return burgerPrice + calculateBaseAdditional();
    }

    public double calculateBurgerPrice() {
        return calculateBaseBurgerPrice();
    }

    private double calculateBaseAdditional(){
        return pricePerOnion*onions + pricePerTomato*tomatoes + pricePerPickle*pickles + pricePerLettuce*lettuce;
    }

    //Show grand total
    public void showGrandTotal(){
        System.out.println("Burger name: " + getBurgerName() + " - Bread Type: " + this.rollType + " - Meat type: " + this.meatType);
        System.out.println("Base burgerPrice: " + getBurgerPrice());
        System.out.println("Additionals: ");
        System.out.println("Onions:   " +  getOnions()   +" x Price per onion   in $  " + getPricePerOnion()    + "\n"  +
                           "Tomatoes: " +  getTomatoes() +" x Price per tomato  in $  " + getPricePerTomato()   + "\n"  +
                           "Pickles:  " +  getPickles()  +" x Price per pickle  in $  " + getPricePerPickle()   + "\n"  +
                           "Lettuce:  " +  getLettuce()  +" x Price per lettuce in $  " + getPricePerLettuce()  + "\n"
        );
        System.out.println("Base Grand Total $: " + calculateBaseBurgerPrice());
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
