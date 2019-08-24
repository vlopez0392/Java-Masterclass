package com.company;

public class Main {

    public static void main(String[] args) {
	// Operators are special Java Symbols to perform specific operations on onw, two or
    // three operands and then return a result.

    //Operands are the describe any object manipulated by a operator.

    //Expressions are combinations of variables, literals and operators.

        int result = 1 + 2; // 1 + 2 = 3 // = is a assignment operator. + is an arithmetic operator.
        System.out.println(" 1+ 2 = "+ result);

        int previousResult = result;
        System.out.println(" previousResult = "+ previousResult);
        result = result - 1;
        System.out.println(" 3 - 1 = "+result);
        System.out.println(" previousResult = "+ previousResult);

        result = result*10; // 2*10=20
        System.out.println(" 2*10 = "+result);

        result = result / 5; // 20/5 = 4
        System.out.println(" 20/5 = "+result);

        result = result%3; //Remainder of 4%3 or remainder of 4/3
        System.out.println(" 4%3 = "+result);

        //Unary Increment and Decrement Operators
        // result = result + 1
        result++; //Unary increment operator // 1+1 =2
        System.out.println(" 1+1 = " + result);

        //result = result -1
         result--;
         System.out.println(" 2-1 = " + result);

        //Compound assignment operators
         //result = result + 2;
         result += 2;
         System.out.println(" 1+2 = " +result);

         //result = result*10;
        result *= 10;
        System.out.println(" 3*10 = "+result);

        //result = result/3
        result /= 3;
        System.out.println(" 30/3 ="+result);

        //result = result -2;
        result -= 2;
        System.out.println(" 10-2 = "+result);
    }
}
