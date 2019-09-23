package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //LinkedList -> Another type of list!

        //Recap
        //Array     -> Indexed list of items - ints, booleans, doubles, etc..
        //ArrayList -> We may store object references.

        //How are primitives and object references referenced in memory?
        // For primitive types, Java will allocate a fixed amount of memory for each element in the Array. e.g.
        //              element 1 would be in address 100, ..., element n would be in address 100 +4*n

        //When dealing with Strings, the sizes of the Strings may vary so our addresses (with a size of 8 bytes) will point
        //to another address where the String will be allocated.

        //Recap of reference values
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;

        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer: "+customer.getName() + " is: " + customer.getBalance() );

        //Moving stuff in the ArrayList
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i =0 ; i<intList.size() ; i++){
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1,2); //add(index, value) -> Moves the rest of the elements "down" to insert the value 2 at
                                        //index 2. -> This process is expensive for larger ArrayList/Array (In the order of ten thousands or millions)

        for(int i =0 ; i<intList.size() ; i++){
            System.out.println(i + " : " + intList.get(i));
        }

        //To solve the cost problem explained above -> We use Linked Lists!!!

        //LinkedList -> Alternative in some situations to the ArrayList.
        //           -> Linked Lists store the link to next item of the list as well as the data in the current link. (Single linked)
        //           -> To insert an element in a LinkedList all we have to do is look for the element before the intended
        //           -> insertion point and  reference that previous element's link to the element to be inserted.
        //           -> Finally, the inserted element needs to point to the next element.
        //           -> Removal of entries is very similar


    }

}
