package com.observer.pattern.weather_application;

import java.util.logging.Logger;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private static final Logger LOGGER = Logger.getLogger(CurrentConditionDisplay.class.getName());
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        String msg = "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity";
        LOGGER.info(msg);
    }
}
