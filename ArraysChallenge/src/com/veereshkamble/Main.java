package com.veereshkamble;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
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
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
