package com.veereshkamble;

public class HeightConversion {

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if(feet < 0 || (inches < 0 && inches >12)) {
            return -1;
        }

        double feetToCms = feet * 12 * 2.54;
        double inchesToCms = inches * 2.54;
        return feetToCms + inchesToCms;
    }

    public static double calcFeetAndInchesToCentimeteres(int inches) {
        if(inches < 0 ) {
            return -1;
        }

        int feetInInches = inches / 12;
        int remainingInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feetInInches, remainingInches);
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6,0) + " cms");
        System.out.println(calcFeetAndInchesToCentimeteres(72) + " cms");
        System.out.println(calcFeetAndInchesToCentimeters(5,7));
    }
}
