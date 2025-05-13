package org.example.Solid.InterfaceSeggregation.Example3.Solution.Solution;

class ValetParking implements Parking, Capacity, Payment {
    @Override
    public void park(Car car) {/* valet parks for you */}

    @Override
    public Car unpark(int ticket) { return null; }

    @Override
    public int getCapacity() { return 120; }

    @Override
    public double getFee(int ticket) { return 25.0; }

    @Override
    public void pay(int ticket) {/* collect payment */}
}