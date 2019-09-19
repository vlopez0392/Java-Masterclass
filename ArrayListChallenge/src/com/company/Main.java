package com.company;

import java.util.Scanner;

public class Main {
    private static MobilePhone mobilePhone = new MobilePhone();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;

        printMenu();
        while(!quit){
            System.out.println("Enter a choice: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 0:
                        printMenu();
                        break;
                    case 1:
                        mobilePhone.printContacts();
                        break;
                    case 2:
                        addContact();
                        break;
                    case 3:
                        updateContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        searchContact();
                        break;
                    case 6:
                        quit = true;
                        break;
                }
            }else{
                scanner.nextLine();
                System.out.println("Invalid input! Please try again. ");
                printMenu();
            }
        }
    }

    private static void printMenu(){
        System.out.println("\n Press: ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add a contact to your mobile phone");
        System.out.println("\t 3 - To update a contact");
        System.out.println("\t 4 - To remove a contact");
        System.out.println("\t 5 - To search for a contact in your contact list");
        System.out.println("\t 6 - To quit the application");
    }

    private static void addContact(){
        System.out.println("Enter a contact name: ");
        String name = scanner.nextLine();

        if(!mobilePhone.findContact(name)){
            System.out.println("Enter a contact phone number: ");
            long number = scanner.nextLong();
            scanner.nextLine();
            mobilePhone.addContact(name, number);
            System.out.println("The contact: " + name + " with Phone #: " + number + " was successfully added to your contact list! ");

        }else{
            System.out.println("The contact: " + name + " is already in your contact list!");
        }
    }

    private static void updateContact(){
        System.out.println("Enter the contact name to update: ");
        String currentName = scanner.nextLine();

        if(mobilePhone.findContact(currentName)){
            System.out.println("Contact found!");
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();

            if(mobilePhone.findContact(newName)){
                System.out.println("That contact name is already in your contact list");
            }else{
                System.out.print("Enter new phone: ");
                long newPhone = scanner.nextLong();
                scanner.nextLine();

                mobilePhone.updateContact(currentName, newName, newPhone);
                System.out.println("Updated contact successfully! ");
            }

        }else{
            System.out.println("No such contact in your current contacts list. Add contact? Y/N");
            String decision = scanner.nextLine();

            switch(decision.toLowerCase()){
                case "y":
                    System.out.println("Adding contact..");
                    addContact();
                    break;
                case "n":
                    System.out.println("You chose not to add the contact. Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid input, returning to main menu...");
            }
        }
    }

    private static void removeContact(){
        System.out.println("Enter contact name to remove: ");
        String name = scanner.nextLine();

        boolean removed = mobilePhone.removeContact(name);

        if(removed){
            System.out.println("Contact removed successfully!");
        }else{
            System.out.println("No such contact in your contact list, going back to the main menu...");
        }
    }

    private static void searchContact(){
        System.out.println("Enter contact name to search: ");
        String name = scanner.nextLine();

        if(mobilePhone.findContact(name)){
            Contact contact = mobilePhone.searchContact(name);
            System.out.println("Found contact with name: " + contact.getContactName() + " and Phone #: " + contact.getContactNumber());
        }else{
            System.out.println("Contact not found!!!");
        }
    }
}
