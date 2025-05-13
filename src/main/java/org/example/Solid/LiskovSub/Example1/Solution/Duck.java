package org.example.Solid.LiskovSub.Example1.Solution;

public class Duck extends Bird implements Fly {
    @Override public void fly() { System.out.println("Flying"); }
}
