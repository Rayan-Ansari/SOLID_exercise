package org.example.DependencyInversion.Example2.Violation;

public class Phone {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
