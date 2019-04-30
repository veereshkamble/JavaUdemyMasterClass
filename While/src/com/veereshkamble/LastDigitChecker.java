package com.veereshkamble;

public class LastDigitChecker {

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    

    public static void main(String[] args) {
        System.out.println(isValid(100));
        System.out.println(isValid(10000));
    }
}
