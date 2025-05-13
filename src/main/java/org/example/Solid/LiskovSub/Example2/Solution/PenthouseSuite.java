package org.example.Solid.LiskovSub.Example2.Solution;

public class PenthouseSuite extends Apartment implements Bedroom {
    public PenthouseSuite() {
        super(4);
    }

    @Override
    public void addOneBedroom() {
        addBedrooms(1);
    }
}
