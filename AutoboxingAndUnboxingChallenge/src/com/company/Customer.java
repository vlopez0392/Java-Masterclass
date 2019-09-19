package com.company;

import java.util.ArrayList;

public class Customer {
    // The Customer class should have an arrayList of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    //Fields
    private String customerName;
    private ArrayList<Double> customerTransactions;

    //Constructor
    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.customerTransactions = new ArrayList<Double>();

        if(initialTransaction > 0){
            this.customerTransactions.add(initialTransaction);
        }
    }

    //Getters
    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }
}
