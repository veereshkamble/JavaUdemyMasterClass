package com.veereshkamble;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long years = minutes / (60 * 24 * 365);
            long remainingMinutes = minutes % (60 * 24 * 365);
            long days = remainingMinutes / (24 * 60);

            System.out.println(minutes + " min " + "= " + years + " y and " + days + " d");

        }
    }

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
