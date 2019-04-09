package com.veereshkamble;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        if ((int)(firstNumber * 1000) == (int)(secondNumber * 1000)) {

            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.176, -3.1768));
    }
}
