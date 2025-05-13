package org.example.Solid.SingleResponsibility.Example1.Solution;

public class Fuel {
    private final int capacity;
    private int level;

    public Fuel(int capacity) {
        this.capacity = capacity;
        this.level = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLevel() {
        return level;
    }

    public void consumeFuel(int amount) {
        level = Math.max(0, level - amount);
    }

    public void refill() {
        level = capacity;
    }
}
