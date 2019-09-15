package com.company;

public class Main {

    public static void main(String[] args) {

        //Burger
        Hamburger burger = new Hamburger("Regular", "White bread", "Beef", 100);
        burger.addBaseItems(1,1,1,1);
        burger.addBaseItems(1,1,1,1); //Added two times! Check if they are added in showGrandTotal()
        burger.showGrandTotal();

        System.out.println();

        //HealthyBurger
        HealthyBurger healthy = new HealthyBurger("Chicken", 200);
        healthy.addBaseItems(2,2,1,1);
        healthy.addHealthyItems(1,1);
        healthy.addHealthyItems(0,5);
        healthy.showGrandTotal();

        System.out.println();

        DeluxeHamburger deluxe = new DeluxeHamburger("White bread", "Bacon and Beef", 175);
        deluxe.showGrandTotal();
    }
}
