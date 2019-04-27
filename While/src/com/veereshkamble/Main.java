package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        }while(count != 6);
    }

    public static boolean isEvenNumber(int number) {

       return (number % 2 == 0);
    }
}
