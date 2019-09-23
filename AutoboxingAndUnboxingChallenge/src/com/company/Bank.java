package com.company;

import java.util.ArrayList;

public class Bank {
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arrayList of Branches
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    //Fields
    private String bankName;
    private ArrayList<Branch> bankBranches;

    //Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranches = new ArrayList<>();
    }

    //Add branch
    public boolean addBranch(Branch branch){
        if(hasBranch(branch)){
            System.out.println(this.bankName + " already has a branch called: " + branch.getBranchName());
            return false;
        }

        System.out.println("Branch: " + branch.getBranchName() +" was added successfully");
        this.bankBranches.add(branch);
        return true;

    }

    //Add a customer given a branch
    public boolean addCustomerToBranch(Customer customer, double initialTransaction, Branch branch ){
        if(hasBranch(branch)){
            return branch.addCustomer(customer, initialTransaction);
        }else{
            System.out.println("Branch not found");
        }
        return false;
    }

    //Perform a transaction given a customer and a branch
    public boolean performTransactionFromBranch(Customer customer, double transaction, Branch branch){
        if(hasBranch(branch)){
            return branch.addTransaction(customer, transaction);
        }else{
            System.out.println("Branch not found");
        }
        return false;
    }

    private boolean hasBranch(Branch branch){
        return this.bankBranches.contains(branch);
    }

    //Print list of branches and optionally the customers transactions from all customers
    public void printBranchesAndCustomers(boolean printTransactions){
        int count = 0;
        for(Branch branch: this.bankBranches){
            count++;
            System.out.println("Branch #" + count +" " + branch.getBranchName());

            int customerCount = 0;
            for(Customer customer : branch.getBranchCustomers()){
                customerCount++;
                System.out.println("Customer #" + customerCount +": " + customer.getCustomerName());
                if(printTransactions){
                branch.printCustomerTransactions(customer, false);
                }
            }

            System.out.println();
        }
    }

    //Print customer transactions at a given branch:
    public void printCustomerTransactionsAtBranch(Customer customer, Branch branch){
        if(hasBranch(branch)){
            branch.printCustomerTransactions(customer, true);
        }else{
            System.out.println("Branch not found");
        }
    }

    //Print all transactions from a given customer at all branches
    public void printTransactionsByCustomer(Customer customer){
        System.out.println("-----------" + this.bankName.toUpperCase() + "-----------");
        System.out.println("OVERALL BANK ACTIVITY FOR CUSTOMER: " + customer.getCustomerName());

        System.out.println("------------------------------------");
        for(Branch branch: this.bankBranches){
            System.out.println("Branch Name: " + branch.getBranchName());
            branch.printCustomerTransactions(customer, false);
        }
        System.out.println("BALANCE: " + customer.getBalance());
        System.out.println("------------------------------------");
        System.out.println();
    }
}
