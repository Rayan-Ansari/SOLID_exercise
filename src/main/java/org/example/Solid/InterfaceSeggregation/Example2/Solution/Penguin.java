package org.example.Solid.InterfaceSeggregation.Example2.Solution;

public class Penguin implements Bird, Swims {
    private String currentLocation;
    private int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void swim() {
        currentLocation = "in the water";
    }

    @Override
    public void molt() {
        numberOfFeathers--;
    }
}
