package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItems(String Item) {
        groceryList.add(Item);
    }

    //Other ways to access an array:
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //Lets modify the modifyGroceryItem such that the user does not have to pass an int value to modify the item.
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    //Do the same for the removeGroceryItem
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    //Modify to return an integer corresponding to the queried position:
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}