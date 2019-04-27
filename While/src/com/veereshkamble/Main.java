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

        int number = 4;
        int finishNumber = 20;
        int countEven = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            countEven++;
            if(countEven == 5) {
                break;
            }
        }

        System.out.println("Number of even numbers = " + countEven);
    }

    public static boolean isEvenNumber(int number) {

       return (number % 2 == 0);
    }
}
