package com.company;
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
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    //Branch constructor
    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    //Getters
    public String getBranchName() {
        return branchName;
    }

    //Required functionality
    //Add customer

    //Add a customer - Available outside Branch
    public boolean addCustomer(Customer newCustomer, double initialTransaction){

        if(!findCustomer(newCustomer)) {
            boolean madeInitialTransaction = initialTransaction > 0;

            if (madeInitialTransaction) {
                System.out.println("Successfully added customer with name: " + newCustomer.getCustomerName() +
                        " with an initial transaction of $: " + initialTransaction + " to Branch: " + this.branchName);
            } else {
                System.out.println("Successfully added customer: " + newCustomer.getCustomerName() + " to Branch: " + this.branchName);
            }
            this.branchCustomers.add(newCustomer);
            newCustomer.getTransactionsPerBranch().add(this);
            newCustomer.getCustomerTransactions().add(initialTransaction);
            return  true;

        }else{
            System.out.println("Customer is already on file");
        }

        return false;
    }

    //Perform a transaction:
    public boolean addTransaction(Customer customer, double transactionAmount){

        if(findCustomer(customer)){
            System.out.println("Performing transaction at: " + this.branchName);
            System.out.println("Customer name: " + customer.getCustomerName());

            if(transactionAmount != 0){
                if(transactionAmount > 0){
                    System.out.println("Deposited a total amount of : " + transactionAmount + " $");
                }else{
                    System.out.println("Withdrew a total amount of: " + (-1*transactionAmount) + " $");
                }

                customer.getTransactionsPerBranch().add(this);
                customer.getCustomerTransactions().add(transactionAmount);
                return true;
            }

            System.out.println("Invalid transaction amount");
            return false;
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

    public boolean customerOnFile(Customer customer){
        return findCustomer(customer);
    }

    //Print customer transaction for this branch
    public void printCustomerTransactions(Customer customer){
        System.out.println("Branch name: " + this.branchName);

        if(findCustomer(customer)){
            System.out.println("Customer name: " + customer.getCustomerName());
            int foundBranch = 0;

            for(int i = 0 ; i < customer.getCustomerTransactions().size(); i++){

                if(customer.getTransactionsPerBranch().get(i).getBranchName().equals(this.branchName)){
                    foundBranch++;
                    double transaction = customer.getCustomerTransactions().get(i);
                    System.out.println(foundBranch + ". " + withDrawalOrDeposit(transaction) +" | $ " + transaction);
                }
            }
        }else{
            System.out.println("Customer not on file");
        }
    }

    private String withDrawalOrDeposit(double amount){
        if(amount > 0){
            return "Deposit     ";
        }else if (amount < 0){
            return "Withdrawal  ";
        }
        else{
            return "Initial transaction";
        }
    }
}
