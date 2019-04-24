package com.veereshkamble;

public class Sum3And5Challenge {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for(int i = 1; i < 1000; i++) {

            if(i % 3== 0 && i % 5 == 0) {
                count++;
                System.out.println("Number: " + i);
                sum = sum + i;
            }

            if(count == 5) {
                System.out.println("Found 5 numbers divisible by both 3 and 5");
                break;
            }

        }

        System.out.println("Sum = " + sum);
    }
}
