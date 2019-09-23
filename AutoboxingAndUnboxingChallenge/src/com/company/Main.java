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
        Customer kumar = new Customer("Siva Kumar");
        Customer bebi = new Customer("Clau Bebi");
        Customer mejia = new Customer("Ana Mejia");

        //Adding the customers to the branches
        North.addCustomer(kumar, 10);
        North.addCustomer(bebi, 100);
        North.addCustomer(mejia, 200);

        System.out.println();

        South.addCustomer(kumar, 150);
        South.addCustomer(bebi, 670);
        South.addCustomer(mejia, 0);

        System.out.println();
        
        //Adding the customers from the bank
        BoT.addCustomerToBranch(kumar, 400, East);
        BoT.addCustomerToBranch(bebi, 200, East);
        BoT.addCustomerToBranch(mejia, 350, East);

        System.out.println();

        BoT.addCustomerToBranch(kumar, 345,  West);
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
        North.addTransaction(kumar, -100.5);
        South.addTransaction(bebi, 250.55);

        BoT.performTransactionFromBranch(mejia, 200.4, East);
        BoT.performTransactionFromBranch(kumar, 120.65, West);

        System.out.println();

        //Performing invalid transactions
        North.addTransaction(kumar, 0);
        BoT.performTransactionFromBranch(bebi, 0, notOnFile);

        System.out.println();

        //Print Bank branches
        BoT.printBranchesAndCustomers(false);   //Will only print Bank Branches

        System.out.println();

        BoT.printBranchesAndCustomers(true);    //Will print both

        System.out.println();

        //Print customer transactions directly from a branch and from the main bank
        North.printCustomerTransactions(kumar, true);

        BoT.printCustomerTransactionsAtBranch(kumar, North);

        //Print all the transactions from a given customer regardless of the branch
        BoT.printTransactionsByCustomer(kumar);
        BoT.printTransactionsByCustomer(mejia);
        BoT.printTransactionsByCustomer(bebi);
    }
}
