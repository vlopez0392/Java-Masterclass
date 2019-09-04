package com.company;

public class Main {

    public static void main(String[] args) {
        //Reverse
        System.out.println(NumberToWords.reverse(123)); //321

        System.out.println(NumberToWords.reverse(102)); //201

        System.out.println(NumberToWords.reverse(-321)); //-123

        //getDigitCount

        System.out.println(NumberToWords.getDigitCount(5200)); //4

        System.out.println(NumberToWords.getDigitCount(100)); //3

        System.out.println(NumberToWords.getDigitCount(-121)); //-1

        //Number To words

        NumberToWords.numberToWords(5200); //Five Two Zero Zero

        NumberToWords.numberToWords(100);  //One Zero Zero

        NumberToWords.numberToWords(0);    //Zero
    }
}
