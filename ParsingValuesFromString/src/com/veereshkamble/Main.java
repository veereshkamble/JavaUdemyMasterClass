package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("numer = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString= " + numberAsString);
        System.out.println("numer = " + number);

        double dNumber = Double.parseDouble(numberAsString);
        System.out.println("number = " + dNumber);
    }
}
