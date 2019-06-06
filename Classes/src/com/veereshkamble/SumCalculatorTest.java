package com.veereshkamble;

public class SumCalculatorTest {

    public static void main(String[] args) {


        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setFirstNumber(5.0);
        sumCalculator.setSecondNumber(4);
        System.out.println("add= " +sumCalculator.getAdditionResult());
        System.out.println("subtract= " +sumCalculator.getSubtractionResult());
        sumCalculator.setFirstNumber(5.25);
        sumCalculator.setSecondNumber(0);
        System.out.println("multiply= " + sumCalculator.getMultiplicationResult());
        System.out.println("divide= " + sumCalculator.getDivisionResult());

    }
}
