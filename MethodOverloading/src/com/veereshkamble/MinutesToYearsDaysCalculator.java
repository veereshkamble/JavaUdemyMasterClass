package com.veereshkamble;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
        }

        long years = minutes / (60 * 24 * 365);
        long remainingMinutes = minutes % (60 * 24 * 365);
        long days = remainingMinutes / (24 * 60);

        System.out.println(minutes + " min " + " = " + years + " y and " + days + " d");
    }
}
