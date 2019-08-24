package com.company;

public class Main {

    public static void main(String[] args) {

        //Lets use the method coded below to calculate different interest rates
        System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = "+calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = "+calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = "+calculateInterest(10000.0, 5.0));
        System.out.println("10,000 at 6% interest = "+calculateInterest(10000.0, 6.0));

        //The code above becomes really tedious after a while. We can use a for-loop to achieve the above
        //as many times as we want

        //for(init: termination condition: increment){}
        //Example

        for(int i=0; i<5 ; i++){
            System.out.println("Loop "+i+ " hello!");
        }
        //Mini-Challenge #1
        //Use the for statement to call the calculateInterest method
        //Use a principal of 10000 with an interest rate of 2,3,4,5,6,7 and 8
        //Print the results to the console window

        for(int i = 2; i<9; i++ ){
            System.out.println("10,000 at "+ i + "% interest = "+String.format("%.2f",calculateInterest(10000.0, i)));
        }
        //The String.format() formats your output to an specific format
        // e.g %.df means  output d digits after the decimal point

        //Mini-Challenge #2
        //How would you modify the loop above to do the same thing as shown but in "reverse"
        //First print 8% interest up all the way to 2%
        System.out.println("******************************");

        for(int i = 8; i > 1; i-- ){
            System.out.println("10,000 at "+ i + "% interest = "+String.format("%.2f",calculateInterest(10000.0, i)));
        }
        //Challenge #3
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // If it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is equal to 3 exit the loop

        int count =0;
        for(int i = 2 ; i<=49 ; i++){
            if(isPrime(i)){
                System.out.println("Found a prime: "+ i);
                count++;
                if(count==10){  //Include this if statement so its evaluated only if a prime is found
                    System.out.println("Found "+ count + " primes. Exiting the loop! ");
                    break;
                }
            }
        }
    }

    private static double calculateInterest(double amount, double interestRate){
        return (amount*interestRate/100);  //Calculate the interest based on principal amount input as a parameter.
    }

    private static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2 ; i <= (long) Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}