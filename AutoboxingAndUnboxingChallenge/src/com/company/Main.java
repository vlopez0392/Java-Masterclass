package com.company;

public class Main {

    public static void main(String[] args) {

        //Lets create the Bank
        Bank BoT = new Bank("Bank of Taiwan");

        //Lets create some branches
        Branch North = new Branch("North");
        Branch South = new Branch("South");
        Branch West  = new Branch("West");
        Branch East  = new Branch("East");

        //Lets add some branches to the Bank
        BoT.addBranch(North);
        BoT.addBranch(South);
        BoT.addBranch(West);
        BoT.addBranch(East);
        System.out.println();

        //Checking if we can add an existing branch - Data validation:
        BoT.addBranch(North);
        System.out.println();

        //Creating some customers
        Customer lopez = new Customer("Victor Lopez");
        Customer bebi = new Customer("Clau Bebi");
        Customer mejia = new Customer("Ana Mejia");

        //Adding the customers to the branches
        North.addCustomer(lopez, 10);
        North.addCustomer(bebi, 100);
        North.addCustomer(mejia, 200);

        System.out.println();

        South.addCustomer(lopez, 150);
        South.addCustomer(bebi, 670);
        South.addCustomer(mejia, 0);

        System.out.println();
        
        //Adding the customers from the bank
        BoT.addCustomerToBranch(lopez, 400, East);
        BoT.addCustomerToBranch(bebi, 200, East);
        BoT.addCustomerToBranch(mejia, 350, East);

        System.out.println();

        BoT.addCustomerToBranch(lopez, 345,  West);
        BoT.addCustomerToBranch(bebi, 200,  West);
        BoT.addCustomerToBranch(mejia, 155 , West);

        System.out.println();

        //Add an existing customer to from both the branch and the bank - Data validation
        North.addCustomer(bebi,2450);
        BoT.addCustomerToBranch(mejia, 450, West);

        //Adding a customer to a branch not on file - Data validation
        Branch notOnFile = new Branch("Unknown");
        BoT.addCustomerToBranch(bebi, 450, notOnFile);

        System.out.println();

        //Performing some transactions from the branches and from the main bank
        North.addTransaction(lopez, -100.5);
        South.addTransaction(bebi, 250.55);

        BoT.performTransactionFromBranch(mejia, 200.4, East);
        BoT.performTransactionFromBranch(lopez, 120.65, West);

        System.out.println();

        //Performing invalid transactions
        North.addTransaction(lopez, 0);
        BoT.performTransactionFromBranch(bebi, 0, notOnFile);

        System.out.println();

        //Print Bank branches
        BoT.printBranches();

        System.out.println();

        West.printCustomerTransactions(lopez);

    }
}
