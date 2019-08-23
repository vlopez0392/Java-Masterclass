package com.company;

public class SecondsAndMinutesChallenge {

    //Bonus Solution 2
    //Using constants - Constants cant be changed and is good practice to declare them in the beginning of the class.

    //Declaring a constant
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";  //final - means it can't be modified
                                                                          //Constants are typed in Uppercase to indicate it is a constant value.
                                                                          //Constants help you avoid typos if a String output is to be repeated in the program.

    //Create a method called getDurationString with two parameters, first parameter
    // minutes and 2nd parameter seconds.

    //You should validate that the first parameter minutes >= 0
    //You should validate that the second parameter seconds is >= 0 and <=59
    //The method should return "Invalid Value" in the method if either of the above are not
    //True.

    //If the parameters are valid then calculate how many hours, minutes and seconds
    //equal the minutes and seconds passed to this method and return that value as a
    //string in the format "XXh YYm ZZs" where XX represents a number of hours, YY the
    //number of minutes and ZZ the seconds

    //Bonus - Output your times in the 00 h 00 m 00 s format

    public static String getDurationString(int minutes, int seconds){
        if(minutes >=0 && (seconds >=0 && seconds <=59)){
            int hours = minutes/60;
            int remainingMinutes = minutes%60;

            String hour   = addLeadingZero(hours);
            String minute = addLeadingZero(remainingMinutes);
            String second = addLeadingZero(seconds);

            String time = hour + " h " + minute+ " minutes "+second+" seconds";;
            System.out.println(time);
            return time;
        }
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
    }
    //Create a 2nd method of the same name but with only one parameter seconds
    //Validate that it is >= 0, and return "Invalid value" if it is not true
    //If its valid, then calculate how many minutes are in the seconds value and then call
    //the other overloaded method passing the correct minutes and seconds calculated
    //so that it can calculate it correctly.

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;

            return getDurationString(minutes,remainingSeconds);
        }
        System.out.println(INVALID_VALUE_MESSAGE);
        return INVALID_VALUE_MESSAGE;
    }
    // Bonus
    public static String addLeadingZero(int value){
        if(value < 10){
            return "0" + value;
        }
         return ""+value;
    }
}
