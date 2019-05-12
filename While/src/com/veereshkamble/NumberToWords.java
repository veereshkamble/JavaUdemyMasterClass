package com.veereshkamble;

public class NumberToWords {

    public static void numberToWords(int number) {

        int reverseNumber = reverse(number);
        int tempReverseNumber = reverseNumber;

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        while(reverseNumber != 0) {
            int digit = reverseNumber % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
        }

        int diff = getDigitCount(number) - getDigitCount(tempReverseNumber);
        if(diff > 0) {
            for(int i = 0; i < diff; i++) {
                System.out.println("Zero");
            }
        }
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

    public static int getDigitCount(int number) {

        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }

        int count = 0;
        while(number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        numberToWords(-234);
        numberToWords(100);
        System.out.println(getDigitCount(100));
        System.out.println(reverse(-123));
    }
}
