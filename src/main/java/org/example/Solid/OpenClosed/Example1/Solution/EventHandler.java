package org.example.Solid.OpenClosed.Example1.Solution;

public class EventHandler {
    private Vehicle vehicle;

    public EventHandler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(Driving drivingMode) {
        drivingMode.apply(vehicle);
    }
}
