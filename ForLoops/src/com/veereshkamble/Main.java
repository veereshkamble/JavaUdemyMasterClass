package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));

        for(int i = 0; i < 5; i++) {
            System.out.println( "Loop " + i + " hello!");

        }

        for(int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + " % interest rate = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + " % interest rate = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        System.out.println(isPrime(10));
        System.out.println(isPrime(11));

        int count = 0;
        for(int i = 10; i <= 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }


        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
