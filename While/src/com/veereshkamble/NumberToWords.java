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
                    break;

                case 1:
                    numberInWords = numberInWords + "One ";
                    break;

                case 2:
                    numberInWords = numberInWords + "Two ";
                    break;

                case 3:
                    numberInWords = numberInWords + "Three ";
                    break;

                case 4:
                    numberInWords = numberInWords + "Four ";
                    break;

                case 5:
                    numberInWords = numberInWords + "Five ";
                    break;

                case 6:
                    numberInWords = numberInWords + "Six ";
                    break;

                case 7:
                    numberInWords = numberInWords + "Seven ";
                    break;

                case 8:
                    numberInWords = numberInWords + "Eight ";
                    break;

                case 9:
                    numberInWords = numberInWords + "Nine ";
                    break;
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
