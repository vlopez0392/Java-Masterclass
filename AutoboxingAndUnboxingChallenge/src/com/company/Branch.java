package com.company;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Branch {
    // Each Branch should have an arrayList of Customers
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    //Fields
    private String BranchName;
    private ArrayList<Customer> branchCustomers;

    //Branch constructor
    public Branch(String branchName) {
        BranchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    //Required functionality

    //Add customer
    private boolean addCustomer(Customer newCustomer){
        return findCustomer(newCustomer);
    }

    //Add a customer - Available outside Branch
    public void addCustomer(String customerName, double initialTransaction){
        Customer newCustomer = new Customer(customerName, initialTransaction);

        if(!findCustomer(newCustomer)) {

            boolean madeInitialTransaction = newCustomer.getCustomerTransactions().isEmpty();
            if (madeInitialTransaction) {
                System.out.println("Successfully added customer: " + newCustomer.getCustomerName() +
                        " with an initial transaction of $: " + newCustomer.getCustomerTransactions().get(0));
            } else {
                System.out.println("Successfully added customer: " + newCustomer.getCustomerName());
            }

            this.branchCustomers.add(newCustomer);
        }else{
            System.out.println("Customer is already on file");
        }
    }

    //Perform a transaction:
    public boolean addTransaction(Customer customer, double transactionAmount){
        if(findCustomer(customer)){
            System.out.println("Performing transaction at: " + this.BranchName);
            System.out.println("Customer name: " + customer.getCustomerName());

            if(transactionAmount > 0){
                System.out.println("Deposited a total amount of : " + transactionAmount + " $");
            }else{
                System.out.println("Withdrew a total amount of: " + transactionAmount + " $");
            }

            customer.getCustomerTransactions().add(transactionAmount);
            return true;
        }

        System.out.println("Customer not on file in this branch!");
        return false;
    }

    //Find a customer
    private boolean findCustomer(Customer someCustomer){
        for(Customer customer : this.branchCustomers){
            if(customer.equals(someCustomer)){
                return true;
            }
        }
        return false;
    }
}
