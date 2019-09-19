package com.company;

import java.util.ArrayList;

public class MobilePhone {
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the ArrayList to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    private ArrayList<Contact> contacts;

    //Constructor-------------------------------------------------------------------------------------------------------
    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    //Print list of contacts--------------------------------------------------------------------------------------------
    public void printContacts(){
        if(!this.contacts.isEmpty()){
            for(int i = 0; i<this.contacts.size(); i++) {
                System.out.println("Contact # " + (i + 1) + " Name: " + this.contacts.get(i).getContactName() + " Phone #: " +
                        this.contacts.get(i).getContactNumber());
            }
        }else{
                System.out.println("Your contact list is empty! ");
        }

    }

    //Add contacts (Functional)-----------------------------------------------------------------------------------------
    public boolean addContact(String name, long phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        return addContact(newContact);
    }

    private boolean addContact(Contact newContact) {
        if(findContact(newContact)){
            return false;
        }
        this.contacts.add(newContact);
        return true;
    }

    //Remove a contact (Functional)-------------------------------------------------------------------------------------
    public boolean removeContact(String name){
        return removeContact(getContactByName(name));
    }

    private boolean removeContact(Contact contact){
        if(contact != null){        //Handles the null pointer exception.
            if(findContact(contact)){
                this.contacts.remove(contact);
                return true;
            }
        }
        return false;
    }

    //Update a contact (Functional)-------------------------------------------------------------------------------------
    public boolean updateContact(String currentName, String newName, long newPhone){
        Contact currentContact = getContactByName(currentName);
        Contact newContact = new Contact(newName, newPhone);

        return updateContact(currentContact, newContact);
    }

    private boolean updateContact(Contact currentContact, Contact newContact){
        if(findContact(currentContact)){
            int index = this.contacts.indexOf(currentContact);
            this.contacts.set(index, newContact);
            return true;
        }
        return false;
    }
    //Query or find a contact (Functional)------------------------------------------------------------------------------
    public boolean findContact(String name){
        name = name.toLowerCase();

        for (Contact contact : this.contacts) {
            if(contactNameAsString(contact).equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean findContact(Contact contact){
        return findContact(contact.getContactName());
    }

    public Contact searchContact(String contactName){ //This method returns the contact given an input name as a String
        if(findContact(contactName)){
            return getContactByName(contactName);
        }

        return null;
    }

    //MobilePhone exclusive methods-------------------------------------------------------------------------------------
    //Get a contact by name
    private Contact getContactByName(String name){
        name = name.toLowerCase();

        for(Contact contact : this.contacts){
            if(contactNameAsString(contact).equals(name)){
                return contact;
            }
        }
        return null;
    }

    //Return the contact name as a String in lowercase
    private String contactNameAsString(Contact contact){
        return contact.getContactName().toLowerCase();
    }
}

