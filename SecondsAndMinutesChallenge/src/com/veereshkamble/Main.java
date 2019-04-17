package com.veereshkamble;

import java.sql.SQLOutput;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
	// write your code here

        System.out.println(getDurationString(65L, 30L));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-2));
        System.out.println(getDurationString(65, 9));

    }

    public static String getDurationString(long minutes, long seconds) {

        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hour = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hourString = hour + "h";
        if(hour < 10) {
            hourString = "0" + hourString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondString = seconds + "s";
        if(seconds < 10) {
            secondString = "0" + secondString;
        }

        return hourString + " " + minutesString + " " + secondString;
    }

    public static String getDurationString(long seconds) {

        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
