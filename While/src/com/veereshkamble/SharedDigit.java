package com.veereshkamble;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        while(num1 != 0) {

            int num1Digit = num1 % 10;
            if(num1Digit == (num2 % 10) || num1Digit == (num2 / 10)) {
                return true;
            }
            num1 /= 10;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
    }
}
