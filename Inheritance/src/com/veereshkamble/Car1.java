package com.veereshkamble;

public class Car1 extends Vehicle1 {

    private int doors;
    private int engineCapacity;

    public Car1(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
