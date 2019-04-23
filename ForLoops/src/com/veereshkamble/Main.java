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
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }
}
