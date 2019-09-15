package com.company;

public class HealthyBurger extends Hamburger{
    // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).

    //Healthy fields
    private int avocado;
    private int carrot;

    private double pricePerAvocado;
    private double pricePerCarrot ;

    //Constructor
    public HealthyBurger(String meatType, double BurgerPrice) {
        super("Healthy Burger", "Brown Rye Bread", meatType, BurgerPrice);
        this.pricePerAvocado = 8.5;
        this.pricePerCarrot  = 1.5;
    }
    //Getters
    public double getPricePerAvocado() {
        return pricePerAvocado;
    }

    public double getPricePerCarrot() {
        return pricePerCarrot;
    }

    public int getAvocados() {
        return avocado;
    }

    public int getCarrots() {
        return carrot;
    }

    //Other methods
    @Override
    public double calculateBurgerPrice() {
        return calculateBaseBurgerPrice()+ this.pricePerCarrot*this.carrot + this.pricePerAvocado*this.avocado;
    }

    @Override
    public void showGrandTotal() {
        super.showGrandTotal();
        System.out.println("Healthy Burger Additionals: " );
        System.out.println("Avocados: " +  getAvocados()   +" x Price per avocados in $  " + getPricePerAvocado()  + "\n"  +
                           "Carrots:  " +  getCarrots ()   +" x Price per carrots  in $  " + getPricePerCarrot()   + "\n");
        double healthyAdditional = calculateBurgerPrice() - calculateBaseBurgerPrice();
        System.out.println("Healthy additional added price $: " + healthyAdditional);
        System.out.println("Grand Total $: " + calculateBurgerPrice());
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    public void addHealthyItems(int avocado, int carrot){
        this.avocado += Math.max(0, avocado);
        this.carrot  += Math.max(0, carrot);
    }
}
