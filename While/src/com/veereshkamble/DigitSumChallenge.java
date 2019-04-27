package com.veereshkamble;

public class DigitSumChallenge {

    public static int sunDigits(int number) {

        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number != 0) {

            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sunDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sunDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sunDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sunDigits(32123));
    }
}
