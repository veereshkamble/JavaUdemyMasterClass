package com.veereshkamble;

class Chevrolet extends Car {
    public Chevrolet(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Chevrolet -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Chevrolet -> accelerate()";
    }

    @Override
    public String brake() {
        return "Chevrolet -> brake()";
    }
}

