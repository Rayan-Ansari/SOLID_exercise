package org.example.Solid.OpenClosed.Example1.Solution;

public class Sport implements Driving {
    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(500);
        vehicle.setSuspensionHeight(10);
    }
}
