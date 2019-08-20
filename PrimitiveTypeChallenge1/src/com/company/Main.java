package com.company;

public class Main {
    public static void main(String[] args) {
        //Challenge
        int a = 10;
        short b = 20;
        byte c = 50;

        long d = 50000L+10L*(a+b+c);
        System.out.println("The value of d is: "+d);

        //What if we want to use  a short? Use casting!

        short e = (short) (1000 + 10*(a+b+c));
        System.out.println("The value of e is: "+e);
    }
}
