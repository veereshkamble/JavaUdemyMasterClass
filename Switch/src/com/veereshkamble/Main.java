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

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was neither 1 or 2");
                break;
        }

        char switchAlphabet = 'A';

        switch(switchAlphabet) {

            case 'A':
                System.out.println("A found");
                break;

            case 'B':
                System.out.println("B found");
                break;

            case 'C':
                System.out.println("C found");
                break;

            case 'D':
                System.out.println("D found");
                break;

            case 'E':
                System.out.println("E found");
                break;

            default:
                System.out.println("Not found");
                break;
        }

    }
}
