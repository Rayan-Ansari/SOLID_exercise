package org.example.Solid.SingleResponsibility.Example1.Solution;

public class Vehicle {
    private final Fuel fuel;

    public Vehicle(int maxFuel) {
        this.fuel = new Fuel(maxFuel);
    }

    public void accelerate() {
        fuel.consumeFuel(1);
    }

    public int getMaxFuel() {
        return fuel.getCapacity();
    }

    public int getRemainingFuel() {
        return fuel.getLevel();
    }
}
