package org.example.Solid.OpenClosed.Example1.Solution;

public class Comfort implements Driving {
    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(400);
        vehicle.setSuspensionHeight(20);
    }
}