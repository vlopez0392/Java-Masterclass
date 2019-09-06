package com.company;

public class Main {
    public static void main(String[] args) {
	    BankAccount vicksAccount = new BankAccount(123, 120.0, "Vick",
                "vlopez0392@gmail.com", 905854050);


        //Additional methods test
        vicksAccount.withdraw(100.0);

	    vicksAccount.deposit(50.0);
	    vicksAccount.withdraw(100.0);

	    vicksAccount.deposit(51.0);
	    vicksAccount.withdraw(100.0);

	    //Testing the getters
        System.out.println(vicksAccount.getAccountNumber());
        System.out.println(vicksAccount.getCustomerName());

        //Creating another instance of BankAccount with the default constructor and default values
        BankAccount defaultAccount = new BankAccount();

        //Creating yet another account with the third overloaded constructor
        BankAccount anotherAccount = new BankAccount("Claudia", "hello@icloud.com", 12345);
        System.out.println(anotherAccount.getcustomerEmail() + " name: "+anotherAccount.getCustomerName());


        //Testing the VipCustomer class
        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer("Bebi", 5000.0);
        System.out.println(vip2.getName());
        System.out.println(vip2.getEmailAddress());

        VipCustomer vip3 = new VipCustomer("Clau Bebi", 50000.0 , "clau.escoto17@gmail.com");
        System.out.println(vip3.getName());
        System.out.println(vip3.getCreditLimit());
    }
}
