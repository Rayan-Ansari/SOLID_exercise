package org.example.Solid.OpenClosed.Example1.Solution;

public class Default implements Driving {
    @Override
    public void apply(Vehicle vehicle) {
        vehicle.setPower(200);
        vehicle.setSuspensionHeight(30);
    }
}
