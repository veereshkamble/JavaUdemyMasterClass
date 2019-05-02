package com.veereshkamble;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if(number < 1) {
            return false;
        }

        int divisor = 1;
        int sum = 0;

        while(divisor <= number / 2) {

            if(number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }

        return (sum == number);
    }

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(28));
    }
}
