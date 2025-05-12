package org.example.Solid.DependencyInversion.Example2.Solution;
/**  abstractuion done for all notifs*/
public interface WeatherAlertSender {
    String generateWeatherAlert(String weatherConditions);
}
