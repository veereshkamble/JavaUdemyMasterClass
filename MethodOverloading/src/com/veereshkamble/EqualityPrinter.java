package com.veereshkamble;

public class EqualityPrinter {

    public static void printEqual(int num1, int num2, int num3) {

        if(num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if(num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if(num1 != num2 && num2 != num3 && num3 != num1) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {

        printEqual(7, 7, 7);
        printEqual(7, 7, 9);
        printEqual(7, 8, 9);
    }
}
