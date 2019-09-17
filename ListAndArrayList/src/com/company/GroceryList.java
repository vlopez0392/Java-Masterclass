package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();   //We don't define the type as we do regularly.
                                                                 // We define the type of data that will go into the
                                                                 //ArrayList using the diamond syntax <>

    //Notice that ArrayLists are declared using the new keyword and thus allow for the use of constructors.

    //Lets add some groceries to our groceryList
    public void addGroceryItems(String Item){
        groceryList.add(Item);    //With an ArrayList, there is no need to define a size. This is handled automatically.
    }

    public void printGroceryLIst(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) +". " + groceryList.get(i)); //ArrayList.get(i) will output the element at index i
                                                                  //in the ArrayList.
        }
    }

    //To modify or replace an item in your list we use the ArrayList.set() method
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    //We use the ArrayList.remove() method to remove elements from the ArrayList.
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position); //ArrayList size resize automatically

        System.out.println("Removed " + theItem +" from your grocery list.");
    }

    //Lets add the ability to query our grocery list:
    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem); //Instead of querying the ArrayList element by element, we
                                                           //use the contains() method to see if the ArrayList contains
                                                           //the element that is being searched.

        //Now we want to return the item we are searching for
        int position = groceryList.indexOf(searchItem);    //indexOf() returns the index of the item we are searching for
                                                           //otherwise it returns -1
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

    //Lets add some extra functionality such that the use does not have to pass an integer to modify and remove methods.
}
