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
        System.out.println(sunDigits(125));
    }
}
