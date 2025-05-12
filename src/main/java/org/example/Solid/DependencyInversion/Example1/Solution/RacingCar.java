package org.example.Solid.DependencyInversion.Example1.Solution;
/**
 * Implements Drivable so that it can be used wherever the abstraction is gonna be.
 */
public class RacingCar implements Car {
    private int remainingFuel;
    private int power;

    public RacingCar(int initialFuel) {
        this.remainingFuel = initialFuel;
        this.power = 0;
    }

    @Override
    public void accelerate() {
        if (remainingFuel <= 0) {
            System.out.println("Out of fuel!");
            return;
        }
        power++;
        remainingFuel--;
        System.out.printf("RacingCar → power=%d, fuel=%d%n", power, remainingFuel);
    }
}
