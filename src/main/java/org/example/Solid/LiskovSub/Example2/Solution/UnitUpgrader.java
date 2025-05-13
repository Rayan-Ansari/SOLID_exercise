package org.example.Solid.LiskovSub.Example2.Solution;

public class UnitUpgrader {
    public void upgrade(Apartment unit) {
        unit.addSquareFootage(40);
        if (unit instanceof Bedroom upgradable) {
            upgradable.addOneBedroom();
        }
    }
}







