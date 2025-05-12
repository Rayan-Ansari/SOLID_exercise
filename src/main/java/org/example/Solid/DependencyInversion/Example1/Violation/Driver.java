package org.example.DependencyInversion.Example1.Violation;

class Driver {
    private RacingCar racingCar;

    public Driver() {
        this.racingCar = new RacingCar(100);
    }

    void increaseSpeed() {
        this.racingCar.accelerate();
    }
}
