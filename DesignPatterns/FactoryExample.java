package DesignPatterns;


/*
 * Creational Design Pattern
 * Used whe we have multiple subclasses of super class & based on input we want to return one class instance
 * it provides abstraction between implementation and client classes
 * In Factory pattern, we create object without exposing the creation logic to the client and
   refer to newly created object using a common interface.

 * A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object
   but let the subclasses decide which class to instantiate

 * Implementation:
 * Super class can be interface or abstract class or basic class
 * Factory class has a static method which returns the instance of subclass based on input

 */

abstract class Vehicle {
    public abstract int getWheel();

    @Override
    public String toString() {
        return "Wheel : " + this.getWheel();
    }
}

class Car extends Vehicle {
    int wheel;

    public Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Bike extends Vehicle {
    int wheel;

    public Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {
        if (type == "car")
            return new Car(wheel);
        else if (type == "bike")
            return new Bike(wheel);
        else
            return null;
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);
        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }

}
