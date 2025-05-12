package SOLID.ISP.Example1.Bad;

public class Client {
}

interface Car{

}
interface ParkingLot {
    void park(Car c); // park
    Car unpark(int ticket); // unpark car
    int getCapacity();  // get capacity of parking lot
    double getFee(int ticket); // get fee for the ticket
    void pay(int ticket); // pay for your ticket
}

//class FreeParking implements ParkingLot {
//// can park and unpark, but fee and pay do not apply
//}
//class ValetParking implements ParkingLot {
//// cannot self-park
//}
//class StreetParking implements ParkingLot {
//// can only self-park
//// has unknown capacity
//}