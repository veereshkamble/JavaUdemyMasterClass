package com.veereshkamble;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum  = 0;
        int count = 0;
        long average = 0;


        while(true) {

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                average = Math.round((double)sum / (double)count);
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }

        }


        scanner.close();
    }

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
}
