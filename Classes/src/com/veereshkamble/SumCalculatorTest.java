package com.veereshkamble;

public class SumCalculatorTest {

    public static void main(String[] args) {


        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setFirstNumber(5.0);
        sumCalculator.setSecondNumber(4);
        System.out.println("add= " +sumCalculator.getAdditionResult());
        System.out.println("subtract= " +sumCalculator.getSubtractionResult());
        
    }
}
