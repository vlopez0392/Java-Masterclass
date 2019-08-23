package com.company;

public class Main {

    public static void main(String[] args) {

        //Lets test all of the values
	    printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(7);

	    ifPrintDayOfTheWeek(0);
        ifPrintDayOfTheWeek(1);
        ifPrintDayOfTheWeek(2);
        ifPrintDayOfTheWeek(3);
        ifPrintDayOfTheWeek(4);
        ifPrintDayOfTheWeek(5);
        ifPrintDayOfTheWeek(6);
        ifPrintDayOfTheWeek(-1);
        ifPrintDayOfTheWeek(7);

    }
    // Challenge
    //Write a method with the name printDayOfTheWeek that has one parameter of type
    //int and name it day

    //The method should not return any value (hint: void)

    //Using a switch statement print "Sunday", "Monday", ... , "Saturday" if the int
    //parameter is 0,1, ... , 6 respectively. Otherwise, it should print "Invalid Day"
    private static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    //Bonus: Write a 2nd solution with the if-then statement
    //Solution with if-then

    //This solution is sub-optimal and its only purpose is to illustrate how
    //using a switch statement helps improve code readability

    private static void ifPrintDayOfTheWeek(int day){
        if(day==0){
            System.out.println("Sunday");
        }else if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid Day");
        }
    }
}
