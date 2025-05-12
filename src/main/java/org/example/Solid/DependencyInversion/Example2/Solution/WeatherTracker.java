package org.example.Solid.DependencyInversion.Example2.Solution;

public class WeatherTracker {
    private String currentConditions;
    private final WeatherAlertSender alertSender;


    public WeatherTracker(WeatherAlertSender alertSender) {
        this.alertSender = alertSender;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = alertSender.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }
}
