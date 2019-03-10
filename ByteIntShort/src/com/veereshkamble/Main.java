package com.veereshkamble;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2147483648;
        int mymaxValue = 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("My Total =" +myTotal);

        //byt has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("My New Byte Value =" +myNewByteValue);

        //short has a width of 16
        short myShortValue = -32768;
        short myNewSHortValue = (short) (myShortValue / 2);
        System.out.println("My Short Value =" +myNewSHortValue);

        //long has a width of 63
        long myLongValue = -9223372036854775807L;

        byte byteValue = 100;
        short shortValue = 1000;
        int intValue = 100000;
        long longValue = 50000L + 10L  * (byteValue + shortValue + intValue);
        System.out.println("Long Value =" +longValue);
    }
}
