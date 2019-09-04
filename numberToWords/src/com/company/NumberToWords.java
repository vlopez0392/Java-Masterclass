package com.company;

public class NumberToWords {

    public  static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }else if (number ==0){
            System.out.println( "Zero");
            return;
        }

        int reverse = reverse(number);
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);
        boolean hasLeadingZeroes = leadingZeroes>0;

        int currentDigit = 0;
        while(reverse > 0){
            currentDigit = reverse%10;
            switch(currentDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
            reverse /= 10;
        }

        if(hasLeadingZeroes){
            for(int i=1; i<=leadingZeroes; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        boolean isNegative = false;
        int reverse = 0;
        int currentDigit = 0;

        if(number < 0){
            isNegative = true;
            number *= -1;
        }

        while(number>0){
            currentDigit = number%10;
            reverse = 10*reverse + currentDigit;
            number /= 10;
        }

        if(isNegative){
            return reverse*-1;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int count = 0;
        if(number == 0){
            return 1;
        }

        while(number >0){
            number /= 10;
            count +=1;
        }
        return count;
    }
}
