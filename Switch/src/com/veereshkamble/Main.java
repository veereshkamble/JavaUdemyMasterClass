package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int value = 1;

        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("Value was neither 1 or 2");
        }

        int switchValue = 2;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Value was neither 1 or 2");
                break;
        }

    }
}
