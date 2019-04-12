package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(90, 30));
        System.out.println(getDurationString(3660));

    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hr = minutes / 60;
        int min = minutes % 60;

        return String.valueOf(hr) + "h " + String.valueOf(min) + "m " + String.valueOf(seconds) + "s";
    }

    public static String getDurationString(int seconds) {

        if(seconds < 0) {
            return "Invalid value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }
}
