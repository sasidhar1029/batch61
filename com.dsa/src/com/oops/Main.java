// Abstraction (Abstract class)
package com.oops;

abstract class Vehicle {
    abstract void start(); // abstract method
}

// Encapsulation (private data + getter/setter)
class Engine {
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

// Inheritance (Car inherits Vehicle)
class Car extends Vehicle {
    Engine engine = new Engine();

    // Polymorphism (Method Overriding)
    @Override
    void start() {
        System.out.println("Car starts with key");
    }

    void showSpeed() {
        System.out.println("Speed: " + engine.getSpeed());
    }
}

class Bike extends Vehicle {
    // Polymorphism (Method Overriding)
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Polymorphism (Runtime - parent reference)
        Vehicle v1 = new Car();
        v1.start();

        Vehicle v2 = new Bike();
        v2.start();

        // Using encapsulation
        Car car = new Car();
        car.engine.setSpeed(80);
        car.showSpeed();
    }
}