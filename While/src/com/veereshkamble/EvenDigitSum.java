package com.veereshkamble;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int sumEven = 0;

        while(number != 0) {
            int digit = number % 10;
            if(digit % 2 == 0) {
                sumEven += digit;
            }
            number /= 10;
        }
        return sumEven;
    }

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
    }
}
