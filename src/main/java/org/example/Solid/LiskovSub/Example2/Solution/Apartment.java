package org.example.Solid.LiskovSub.Example2.Solution;

public abstract class Apartment {
    private int squareFootage;
    private int numberOfBedrooms;

    protected Apartment(int bedrooms) {
        this.numberOfBedrooms = bedrooms;
    }

    public void addSquareFootage(int sqft) {
        squareFootage += sqft;
    }

    protected void addBedrooms(int n) {
        numberOfBedrooms += n;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
}