package com.company;

public class Main {

    public static void main(String[] args) {
	// Primitive types

       //int
        int myValue = 10000;

        //Wrapper class Integer MAX AND MIN VALUES
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;

        System.out.println("Integer Maximum value =" + intMaxValue);
        System.out.println("Integer Minimum value =" + intMinValue);

        //Overflow and underflow examples
        System.out.println("Busted maxIntValue = " + (intMaxValue + 1 ));
        System.out.println("Busted minIntValue = " + (intMinValue - 1 ));

        //If we input something longer than a  MAX OR MIN value as a literal Java will flag it as an error
        //int impossible = 2147483648;

        //We may use a long instead
        long possible = 2147483648L;

        //What about the other primitive Integral types? byte, short and long?
        //byte
        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;

        System.out.println("Byte Maximum value = " + byteMaxValue);
        System.out.println("Byte Minimum value = " + byteMinValue);

        //short
        short shortMaxValue = Short.MAX_VALUE;
        short shortMinValue = Short.MIN_VALUE;

        System.out.println("Short Maximum value = " + shortMaxValue);
        System.out.println("Short Minimum value = " + shortMinValue);

        //long
        long myLongValue = 100L;
        System.out.println("My long value is: "+ myLongValue);

        long longMaxValue = Long.MAX_VALUE;
        long longMinValue = Long.MIN_VALUE;

        System.out.println("long Maximum value = " + longMaxValue);
        System.out.println("long Minimum value = " + longMinValue);

        ///Conversions of integer literals are done if the integer literal fits into to the converted type. Also, the integer literal must be within the int range.

        //long bigLong = 2147483648; //Java will flag this as an error

        long bigLong = 214_748_364_8L;  //Add L at the end of the literal to let Java know this is a long

        //Casting
        int myTotal = (intMinValue/2); //No problems here

        byte newByte =(byte) (byteMinValue/2 ); //A casting operation is required here
        short newSHort = (short) (shortMinValue/2);

        //Challenge
        int a = 500;
        short b = 24;
        byte c = 25;

        long d = 50000+10*(a+b+c);
        System.out.println("The value of d is: "+d);
        }
    }
