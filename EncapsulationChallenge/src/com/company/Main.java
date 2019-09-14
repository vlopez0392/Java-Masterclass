package com.company;

public class Main {

    public static void main(String[] args) {
        Printer myPrinter = new Printer(70, true);
        System.out.println("Pages printed: " + myPrinter.getPagesPrinted());
        myPrinter.print(5);
        myPrinter.print(6);
        myPrinter.refillToner(31);

        System.out.println();

        Printer anotherPrinter = new Printer(2, false);
        System.out.println("Pages printed: " + anotherPrinter.getPagesPrinted());
        anotherPrinter.print(3);
        anotherPrinter.print(5);
        anotherPrinter.refillToner(98);
    }
}
