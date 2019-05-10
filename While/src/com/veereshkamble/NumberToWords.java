package com.veereshkamble;

public class NumberToWords {

    public static void numberToWords(int number) {

        int reverseNumber = reverse(number);
        System.out.println(reverseNumber);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        numberToWords(234);
    }
}
