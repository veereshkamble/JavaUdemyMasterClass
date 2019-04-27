package com.veereshkamble;

public class NumberPalindrome {

    public static boolean isPlaindrome(int number) {

        if (number < 0) {
            number = Math.abs(number);
        }

        int tempNumber = number;
        int reverseNumber = 0;
        while(number != 0) {
            int digit = number % 10;
            reverseNumber =reverseNumber * 10 + digit;
            number = number / 10;
        }

        return reverseNumber == tempNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPlaindrome(1221));
    }
}
