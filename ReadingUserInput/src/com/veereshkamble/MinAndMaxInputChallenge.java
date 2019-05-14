package com.veereshkamble;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int num = scanner.nextInt();

                if(num > max) {
                    max = num;
                }

                if(num < min) {
                    min = num;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);
        scanner.close();
    }
}
