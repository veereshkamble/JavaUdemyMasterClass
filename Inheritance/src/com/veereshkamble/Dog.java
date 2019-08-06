package com.veereshkamble;

/**
 * Created by Vee on Aug 5, 2019
 */

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog() {
    }

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }


}
