package org.example.Solid.DependencyInversion.Example2.Solution;
/** an alert via email*/
public class Emailer implements WeatherAlertSender {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions + " (sent via email)";
    }
}
