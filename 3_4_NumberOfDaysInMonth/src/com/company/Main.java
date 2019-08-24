package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2020)); //29
        System.out.println(getDaysInMonth(8,2019)); //31
    }
    //Write a method getDaysInMonth with two parameters month and year. ​Both of type int.

    //If parameter month is < 1 or > 12 return -1. ​
    //If parameter year is < 1 or > 9999 then return -1.

    //This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
    //You should check if the year is a leap year using the method isLeapYear

    public static int getDaysInMonth(int month, int year){
        if( (month>=1 && month<=12) && (year>=1 && year<=9999) ){
            switch (month){
                case 1:
                    return 31;
                case 2:
                    if(isLeapYear(year)){
                        return 29;
                    }
                    return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }
        }
        return -1;
    }

    public static boolean isLeapYear(int num){
        if( num >= 1 && num <= 9999){
            if(num % 4 == 0){
                if(num%100 == 0){
                    return num%400 == 0;
                }
                return true;
            }
        }
        return false;
    }
}
