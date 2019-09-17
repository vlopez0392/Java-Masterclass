package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    // -Write a method called reverse() with an int array as a parameter.
    //
    //-The method should not return any value. In other words, the method is allowed to modify the array parameter.
    //
    //-In main() test the reverse() method and print the array both reversed and non-reversed.
    //
    //-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
    //
    //-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

        //Odd numbered array
        int [] odd = {1,2,3,4,5};
        System.out.println("Original array (Odd number of elements) : " + Arrays.toString(odd));

        reverse(odd);
        System.out.println("Reversed array (Odd number of elements) : " + Arrays.toString(odd));

        //Even numbered array
        int [] even = {100,2,-3,400};
        System.out.println("Original array (even number of elements) : " + Arrays.toString(even));

        reverse(even);
        System.out.println("Reversed array (even number of elements) : " + Arrays.toString(even));
    }

    private static void reverse(int[] array){ //Course implementation is very similar
        int max = array.length -1;
        int half = array.length/2;

        for(int i = 0 ; i< half ; i++){
            int temp = array[i];
            array[i] = array[max- i];
            array[max - i] = temp;
        }
    }
}
