package com.veereshkamble;

public class LastDigitChecker {

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }


        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        return (num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit || num2LastDigit == num3LastDigit);

    }


    public static void main(String[] args) {
        System.out.println(isValid(100));
        System.out.println(isValid(10000));
    }
}
