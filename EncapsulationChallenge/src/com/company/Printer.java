package com.company;

import com.sun.security.jgss.GSSUtil;

public class Printer {
    // Create a class and demonstrate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.\

    //Fields
    private int tonerLevel = 100;
    private int pagesPrinted ;
    private boolean isDuplex;

    //Constructor
    public Printer(int tonerLevel, boolean isDuplex) {

        if(tonerLevel >= 0 & tonerLevel<= 100){
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    //Getters
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    //Methods
    public void refillToner(int refillAmount){
        if(refillAmount > 0) {
            this.tonerLevel += refillAmount;
            int overfill = 0;

            if (this.tonerLevel > 100) { //Allow overfill. The remaining toner will remain in the cartridge.
                overfill = this.tonerLevel - 100;
                this.tonerLevel = 100;
            }

            System.out.println("Refilled toner successfully. Current level: " + this.tonerLevel + " Remaining refill: " + overfill);
        }else{
            System.out.println("Invalid toner amount");
        }
    }

    public void print(int printPages){
        if(!this.isDuplex){

            System.out.println("Printing ");
            this.pagesPrinted += printPages;
            System.out.println("Printed "+ printPages +" pages. Total pages printed so far: "+this.pagesPrinted);

        }else{
            System.out.println("Duplex printing");
            //If is duplex, printing an even number of pages will add a total printPages%2 (e.g. printing a 2 page document
            //results in one page being printed)

            int actualPrinted =  printPages/2;;
            if(printPages%2 ==0){
                this.pagesPrinted += actualPrinted;

            }else{ //Printing an odd number of pages results in a total of ceil(printPages/2) (e.g Printing 3 pages results
                  // in 2 physical pages being output by the printer (Although only 1.5 pages were actually printed)

                actualPrinted =(int) Math.round( (double) actualPrinted);
                this.pagesPrinted += actualPrinted;
            }

            System.out.println("Printed "+ actualPrinted +" pages. Total pages printed so far: "+this.pagesPrinted);
        }
    }
}
