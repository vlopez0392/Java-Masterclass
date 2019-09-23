package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    //Add a branch
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    //Add a customer
    public boolean addCustomer(String branchName, String customerName, double iniitalAmount){
        Branch branch = findBranch(branchName);

        if(branch != null){
            return branch.newCustomer(customerName, iniitalAmount);
        }
        return false;
    }

    //Add a transaction
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    
    //Find a Branch
    private Branch findBranch(String customerName){
        for(int i = 0; i<this.branches.size();i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(customerName)){
                return checkedBranch;
            }
        }
        return null;
    }

    //List the customersTransactions

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);

        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");

                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();

                    for(int j = 0; j<transactions.size(); j++){
                        System.out.println( "[" + (j+1) + "]" + " Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }

        return false;
    }
}
