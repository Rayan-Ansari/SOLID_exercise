package org.example.Solid.InterfaceSeggregation.Example3.Solution.Solution;

class StreetParking implements Parking {
    @Override
    public void park(Car car) {/* driver self-parks */ }

    @Override
    public Car unpark(int ticket) { return null; }
}
