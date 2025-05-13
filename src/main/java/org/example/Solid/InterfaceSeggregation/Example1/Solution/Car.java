package org.example.Solid.InterfaceSeggregation.Example1.Solution;

class Car implements EngineStarts, RadioControls {
    private boolean radioOn;

    @Override
    public void startEngine() {

    }

    @Override
    public void turnRadioOn()  { radioOn = true; }

    @Override
    public void turnRadioOff() { radioOn = false; }
}
