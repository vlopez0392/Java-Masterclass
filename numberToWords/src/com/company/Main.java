package com.company;

public class Main {

    public static void main(String[] args) {
        //Reverse
        System.out.println(NumberToWords.reverse(123)); //321

        System.out.println(NumberToWords.reverse(102)); //102

        System.out.println(NumberToWords.reverse(-321)); //-123

        //getDigitCount

        System.out.println(NumberToWords.getDigitCount(5200)); //4

        System.out.println(NumberToWords.getDigitCount(100)); //3

        System.out.println(NumberToWords.getDigitCount(-121)); //-1

        //Number To words

        NumberToWords.numberToWords(5200);

        NumberToWords.numberToWords(100);

        NumberToWords.numberToWords(0);

    }
}
