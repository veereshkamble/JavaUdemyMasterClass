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

    

    public static void main(String[] args) {
        numberToWords(234);
    }
}
