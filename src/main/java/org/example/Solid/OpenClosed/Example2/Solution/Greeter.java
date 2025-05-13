package org.example.Solid.OpenClosed.Example2.Solution;

public class Greeter {
    private Formalities strategy;

    public Greeter(Formalities strategy) {
        this.strategy = strategy;
    }

    public void setGreetingStrategy(Formalities strategy) {
        this.strategy = strategy;
    }

    public String greet() {
        return strategy.greet();
    }
}