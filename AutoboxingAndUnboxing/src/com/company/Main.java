package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Lets create some arrays
        String [] stringArray = new String[10];
        int[] intArray = new int[10];

        //Lets create some arrayLists too:
        ArrayList<String> strArrayList = new ArrayList<>(); //An arrayList that holds String references
        strArrayList.add("Vick");

        //THe following is NOT allowed -> ArrayLists with primitive types!

        //ArrayList<int> intArrayList = new ArrayList<int>();  //We need a class reference in order to create and store in an ArrayList!

        //Possible solutions:
        //1. Create a class! Lets create an "int" class!
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54)); //First element in your ArrayList -> Needs a class for each primitive type! Messy!

        //2. Use Autoboxing - Basically in-built Java wrapper classes.

        //Lets create an Integer class:
        Integer integer = new Integer(53);

        //This holds true for other primitive types as well:
        Double doubleValue = new Double(12.25);

        //NOW we can add primitive types to an ArrayList using Autoboxing:
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0; i <=10 ; i++){
            integerArrayList.add(Integer.valueOf(i)); //valueOf(i) - Takes the int value of i and performs autoboxing into an Integer wrapper
        }

        for (int i = 0; i<=10 ; i++){
            System.out.println("int value of integerArrayList -> " + integerArrayList.get(i).intValue()); //intValue() unboxes the wrapped int value.
        }

        //The valueOf(i) and get(i).intValue() lines are not required. We can perform autoboxing and unboxing automatically!
        Integer myIntValue = 56; //Automatic autoboxing - At compile time Java sees this Integer.valueOf(56)
        int myInt = myIntValue;  //Automatic unboxing   - At compile time Java seed this myIntValue.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<>();

        //One more example with long autoboxing and unboxing:
        for(double dbl =0.0 ; dbl <= 10.0 ; dbl +=0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubleValues.size() ; i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

        //Now lets do the same with automatic autoboxing and unboxing
        for(double dbl =0.0 ; dbl <= 10.0 ; dbl +=0.5){
            myDoubleValues.add(dbl);
        }

        for(int i = 0; i < myDoubleValues.size() ; i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}

class IntClass{ // This is a wrapper class by definition. Wraps the int value in an fully contained class.
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


