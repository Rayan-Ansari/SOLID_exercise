package org.example.LiskovSub.Example2.Violation;

public abstract class Apartment {
    public int squareFootage;
    public int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}
