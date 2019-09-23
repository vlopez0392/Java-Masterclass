package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {    //psvm shortcut creates a main method

        //LinkedList declaration
        LinkedList<String> placesToVisit = new LinkedList<>();

        //Adding elements to the linkedList is very similar with the .add() method
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        //Lets insert an element
        placesToVisit.add(1,"Alice Springs"); //Linking happens automatically!
        printList(placesToVisit);

        //Lets remove an element
        placesToVisit.remove(4);                      //Linking happens automatically in with O(1) complexity.
        printList(placesToVisit);

        //Add in order
        LinkedList<String> sortedList = new LinkedList<>();
        addInOrder(sortedList, "Sydney");
        addInOrder(sortedList, "Melbourne");
        addInOrder(sortedList, "Brisbane");
        addInOrder(sortedList, "Perth");
        addInOrder(sortedList, "Canberra");
        addInOrder(sortedList, "Adelaide");
        addInOrder(sortedList, "Darwin");
        printList(sortedList);

        //Data validation -> Avoid adding duplicates
        addInOrder(sortedList, "Alice Springs");
        addInOrder(sortedList, "Darwin");
        printList(sortedList);

        visitCities(sortedList);
    }

    private static void printList(LinkedList<String> linkedList){
        //We are going to use the concept of Iterator to traverse our LinkedList
        //Iterator --> An Iterator is another way of accessing the elements in a particular Array or ArrayList

        Iterator<String> i = linkedList.iterator(); //This the equivalent of the traditional for-loop we have used before

        while(i.hasNext()){ //While i has a next element to point to, execute the loop.
            System.out.println("Now visiting: " + i.next()); //i.next() -> Output current element and move to the next one (i++).
        }
        System.out.println("========================");
    }

    //Lets add our elements in Alphabetical order
    //To do so, lets implement a List Iterator

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity) {

        //A list Iterator gives you more flexibility than a regular Iterator -> Useful when inserting records is commonplace.
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0){ //Equal - Do not Add!
                System.out.println(newCity + " is already  included as a destination");
                return false;
            }else if(comparison > 0){
                // newCity should appear before
                stringListIterator.previous();  //A regular Iterator does not let you go back! .previous() moves to the
                                                // correct insertion point for new city -> Before the current index
                stringListIterator.add(newCity);
                return true;
            }
        }

        stringListIterator.add(newCity); //Reached the end of the list
        return true;
    }

    //Lets exemplify the power of Linked Lists by making an small application to visit our nodes on command.
    private static void visitCities(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; //Tracks the direction

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){   //getFirst() gets the first element -> DO not use it to check if the LinkedList is empty
            System.out.println("No cities in the itinerary! ");
            return;
        }else{
            System.out.println("Now visiting: " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting: " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list!");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting: " + listIterator.previous());
                    }else{
                        System.out.println("Reached the beginning of the list! ");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \n Press: ");
        System.out.println("0 - To quit \n" +
                           "1 - To go to the next city \n" +
                           "2 - To go to the previous city \n" +
                           "3 - To print menu options \n"
        );
    }

    //The compareTo() method (when called on Strings) returns:
    // * == 0 if the current index of the linkedList is equal to the new City;
    // *  > 0 if the current index of the linkedList appears after newCity  -> newCity should appear before current index
    // *  < 0 if the current index of the linkedLIst appears before newCity -> newCity should appear after current index

    //When you create an Iterator you must call the .next() method to point to the first element in the LInkedList
    //This does NOT happen automatically.

    //Java implements a Doubly Linked List -> Each node has access to both next and previous nodes
}
