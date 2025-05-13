package org.example.Solid.InterfaceSeggregation.Example3.Solution.Solution;

class FreeParking implements Parking, Capacity {
    @Override
    public void park(Car car) {/* … */}

    @Override
    public Car unpark(int ticket) { return null; }

    @Override
    public int getCapacity() { return 50; }
}
