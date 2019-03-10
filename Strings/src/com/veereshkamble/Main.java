package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String myString = "This is a string";
        System.out.println("myString equal to " +myString);
        myString = myString + ", and this is more";
        System.out.println("myString equal to " +myString);
        myString = myString + "\u00A9";
        System.out.println("myString equal to " +myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberstring equal to " +numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("last String equal to " +lastString);
        
    }
}
