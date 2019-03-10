package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("My Int Value = " +myIntValue);
        System.out.println("My Float Value = " +myFloatValue);
        System.out.println("My double Value = " +myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds * 0.45359237;
        System.out.println("Kilograms =" + kilograms);
    }
}
