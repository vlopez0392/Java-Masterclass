package com.company;

public class SumOddRange {

//    Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
//    Check that number is > 0, if it is not return false.
//    If number is odd return true, otherwise  return false.

//    Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//    The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
//    It should call the method isOdd to check if each number is odd.

//    The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//    If those conditions are not satisfied return -1 from the method to indicate invalid input.

    public static boolean isOdd(int number) {
        if(number < 0 || (number % 2 == 0)){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        if(start > 0 && end > 0 && end >= start) {
            int sum = 0;
            for (int j = start; j <= end; j++ ) {
                if(isOdd(j)){
                    sum += j;
                }
            }
            System.out.println("Sum odd from " + start + " to "+ end + " is: "+sum);
            return sum;
        }
        return -1;
    }
}
