package org.example.Solid.InterfaceSeggregation.Example1.Solution;

class Drone implements EngineStarts, CameraControls {
    private boolean cameraOn;

    @Override
    public void startEngine() {

    }

    @Override
    public void turnCameraOn()  { cameraOn = true; }

    @Override
    public void turnCameraOff() { cameraOn = false; }
}