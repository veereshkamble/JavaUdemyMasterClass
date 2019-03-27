package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here. Contains code to test our class and not the solution
        System.out.println("Coding Exercises begin here and now. Today!");


        SpeedConverter speedConverter = new SpeedConverter();
        long miles = speedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " +miles);
        speedConverter.printConversion(10.5);
    }
}
