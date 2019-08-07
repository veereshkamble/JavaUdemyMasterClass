package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new  Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");

        dog.eat();
        dog.walk();
        dog.run();*/

        Camaro camaro = new Camaro(36);
        camaro.steer(45);
        camaro.accelerate(30);
        camaro.accelerate(20);
        camaro.accelerate(-43);
    }
}
