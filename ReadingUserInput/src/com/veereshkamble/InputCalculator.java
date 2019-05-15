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
                break;
            }

            average = Math.round(sum / count);

            System.out.println("SUM = " + sum + " AVG = " + average);

        }

        scanner.close();
    }
}
