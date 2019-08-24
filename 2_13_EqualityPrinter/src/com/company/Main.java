package com.company;

public class Main {

    public static void main(String[] args) {
	 IntEqualityPrinter.printEqual(1,1,1); //All equal
	 IntEqualityPrinter.printEqual(1,2,1); //Neither all equal or different
	 IntEqualityPrinter.printEqual(1,2,3); //All different
     IntEqualityPrinter.printEqual(-1,-1,-1); //Invalid
    }
}
