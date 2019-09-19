package com.company;

import java.util.ArrayList;

public class MobilePhone {

    //Fields
    private String myNumber;
    private ArrayList<Contact> myContacts;

    //Constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    //Add contact
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }

        this.myContacts.add(contact);
        return true;
    }

    //Update contact
    public boolean updateContact(Contact oldContact , Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    //Remove a contact
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " . was deleted.");
        return true;
    }

    //Find contact
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0 ; i<this.myContacts.size() ; i++){
            Contact j = this.myContacts.get(i);

            if(j.getName().equals(contactName)){
                return i;
            }
        }

        return -1; //Contact not found
    }

    //This findContact returns the contact name as a String -> Publicly accessible
    public String queryContact(Contact contact){
        if(findContact(contact) >=0 ){
            return contact.getName();
        }
        return null;
    }

}
