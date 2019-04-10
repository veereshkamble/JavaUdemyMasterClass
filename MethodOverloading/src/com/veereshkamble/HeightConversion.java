package com.veereshkamble;

public class HeightConversion {

    public double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if(feet < 0 || (inches < 0 && inches >12)) {
            return -1;
        }

        double feetToCms = feet * 12 * 2.54;
        double inchesToCms = inches * 2.54;
        return feetToCms + inchesToCms;
    }

    public double calcFeetAndInchesToCentimeteres(int inches) {
        if(inches < 0 ) {
            return -1;
        }

        int feetInInches = inches / 12;
        int remainingInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feetInInches, remainingInches);
    }
    
}
