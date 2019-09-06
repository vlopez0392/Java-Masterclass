package com.company;

public class VipCustomer {
    // Constructor Challenge #2
    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.

    //Fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    //Constructors

    //Default constructor
    public VipCustomer() {
        this("Victor Lopez", 500.0, "vlopez0392@gmail.com");
    }

    //COnstructor with two parameters
    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "vlopez0392@gmail.com");
    }

    //Constructor with 3 parameters
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
