package com.company;

public class Contact {

    // You will want to create a separate class for Contacts (name and phone number).
    //Contact name and phone number fields
    private String contactName;
    private long contactNumber;

    //Constructor
    public Contact(String contactName, long contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    //Getters
    public String getContactName() {
        return contactName;
    }

    public long getContactNumber() {
        return contactNumber;
    }
}
