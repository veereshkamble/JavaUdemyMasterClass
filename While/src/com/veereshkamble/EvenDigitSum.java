package com.veereshkamble;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int count = 0;
        int sumEven = 0;

        while(number != 0) {
            int digit = number % 10;
            if(count % 2 == 0) {
                sumEven += digit;
            }
            count++;
            number /= 10;
        }
        return sumEven;
    }
}
