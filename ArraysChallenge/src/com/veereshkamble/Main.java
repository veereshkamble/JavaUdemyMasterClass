package com.veereshkamble;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        sortArray(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + "integer values. \r");
        int[] values = new int[number];

        for(int i =0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] myIntArray) {
        for(int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length - i; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return  array;
    }
}
