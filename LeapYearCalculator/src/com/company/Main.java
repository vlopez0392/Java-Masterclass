package com.company;

public class Main {

    public static void main(String[] args) {
        boolean test1 = LeapYear.isLeapYear(1600); //true
        System.out.println(test1);

        boolean test2 = LeapYear.isLeapYear(1000); //false
        System.out.println(test2);

        boolean test3 = LeapYear.isLeapYear(1924); //true
        System.out.println(test3);
    }
}
