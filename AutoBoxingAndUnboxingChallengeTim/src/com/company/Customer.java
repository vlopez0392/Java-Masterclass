package com.company;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    //Add a transaction to the arrayList
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    //Getters
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


}
