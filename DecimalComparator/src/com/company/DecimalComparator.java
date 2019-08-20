package com.company;

//A simple decimal comparator to up three decimal places
public class DecimalComparator {

        public static boolean areEqualByThreeDecimalPlaces(double a, double b){
            a *= 1000;
            b *= 1000;
            int c = (int) a;
            int d = (int) b;

            return c==d;
        }
}
