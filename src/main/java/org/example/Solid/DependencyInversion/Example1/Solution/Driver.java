package org.example.Solid.DependencyInversion.Example1.Solution;

class Driver {
    private final Car Car;

    /** the  car  is injected from the outside*/
    public Driver(Car vehicle) {
        this.Car = vehicle;
    }

    public void increaseSpeed() {
        Car.accelerate();
    }
}
