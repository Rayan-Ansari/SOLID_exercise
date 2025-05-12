package org.example.Solid.DependencyInversion.Example2.Solution;
/** an alert via call or msg*/
public class Phone implements WeatherAlertSender {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions + " (sent via phone)";
    }
}
