package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: "  );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n Press: ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To process Array List");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItems(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();

        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        }else{
            System.out.println(searchItem + " is not in the grocery list");
        }
    }

    public static void processArrayList(){
        //Lets copy one ArrayList into another ArrayList
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList()); //This is a way to copy an array

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList()); //This is the second way.
                                                                                     //This is very convenient.

        //To revert back to a regular Array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}

