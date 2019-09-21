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
    private ArrayList<Branch> transactionsPerBranch;
    private double balance;

    //Constructor
    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerTransactions = new ArrayList<Double>();
        this.transactionsPerBranch =new ArrayList<Branch>();
    }

    //Getters
    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }

    public ArrayList<Branch> getTransactionsPerBranch() {
        return transactionsPerBranch;
    }

    public double getBalance() {
        return getOverallBalance();
    }

    public double getOverallBalance(){
        for(int i = 0; i < this.getCustomerTransactions().size() ; i++){
            this.balance += this.customerTransactions.get(i);
        }

        return this.balance;
    }
}
