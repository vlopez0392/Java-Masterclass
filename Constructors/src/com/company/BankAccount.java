package com.company;

public class BankAccount {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, customerEmail and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    //Fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    //Constructor -> Allows you to set the initial values of your fields.
                //-> Constructor are only called once. They are called when the object is created

    //Default Constructor -> Creates an object in memory but it does not define the fields
    //Empty constructor (May be called with some default values)
    public BankAccount(){
        this(12345, 100.0, "default name", "default address", 1234); //We call the other constructor with the this() special method
                                                                                                                                //Must be the first line to be executed
        System.out.println("Bank account created");
    }

    //Just like methods, constructors can be overloaded, provided we define another constructor signature
    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, int phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    //Using setters in the constructor is not recommended. Only use other constructors
    //Objects is created with the constructor -> Some aspects of the initialization may
    //have not yet finished when the constructor is called.

    //Creating another overloaded constructor with a different signature
    public BankAccount(String customerName, String customerEmail, int phoneNumber) { //Two deafult parameters
        this(9999, 55, customerName, customerEmail, phoneNumber);
    }

    //Getters
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getcustomerEmail(){
        return this.customerEmail;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    //Setters (Some setters could be private)
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Additional methods (Deposit and Withdraw)
    public void deposit(double depositAmount){
        if(depositAmount<=0){
            System.out.println("Invalid deposit amount.");
            return;
        }
        double oldBalance = this.balance;
        this.balance += depositAmount;
        System.out.println("Previous balance: "+oldBalance + " Deposit amount: "+depositAmount+" Current balance: "+this.balance);
    }

    public void withdraw(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Insufficient funds to perform transaction. ");
            return;
        }

        double oldBalance = this.balance;
        this.balance -= withdrawalAmount;
        System.out.println("Previous balance: "+oldBalance + " Withdrawal amount: "+withdrawalAmount+" Current balance: "+this.balance);
    }
}
