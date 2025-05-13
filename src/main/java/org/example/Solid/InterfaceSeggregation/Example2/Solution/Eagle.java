package org.example.Solid.InterfaceSeggregation.Example2.Solution;

public class Eagle implements Bird, Flies {
    private String currentLocation;
    private int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        currentLocation = "in the air";
    }

    @Override
    public void molt() {
        numberOfFeathers--;
    }
}
