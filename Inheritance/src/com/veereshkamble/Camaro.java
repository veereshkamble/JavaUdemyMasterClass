package com.veereshkamble;

public class Camaro extends Car {

    private int roadService;

    public Camaro(int roadService) {
        super("Camaro", "4WD", 4, 2, 8, true);
        this.roadService = roadService;
    }
}
