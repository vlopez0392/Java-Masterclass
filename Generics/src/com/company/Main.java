package com.company;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Generics: Allow us to create classes, interfaces and methods that take types as parameters, Type parameters.
        //Let's explore an example that doesn't implement generics

        //ArrayList items = new ArrayList(); //No type here "Raw use of an ArrayList", the ArrayList can contain anything.
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Vick"); //This is valid, no type checking in the ArrayList. -> Ok in Java 1.5 - This is still allowed
                           //for backwards compatibility.
        items.add(4);
        items.add(5);

        printDoubled(items); //The problem shown above will not appear until runtime
    }

    private static void printDoubled(ArrayList<Integer> n){
        for(Object i: n){
            System.out.println((Integer) i*2); //Casting is required here to tell Java the type of object contained
                                               //in the ArrayList
        }
    }

    //Parameterized type -> A type provided to a generic type. Type is specified with < >
}
