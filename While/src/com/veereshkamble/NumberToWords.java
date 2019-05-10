package com.veereshkamble;

public class NumberToWords {

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        String numberInWords = "";

        while(reverseNumber != 0) {
            int digit = reverseNumber % 10;
            switch (digit) {
                case 0:
                    numberInWords = numberInWords + "Zero ";
            }
        }
    }

    public static int reverse(int number) {

        int reverse = 0;
        number = Math.abs(number);

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
