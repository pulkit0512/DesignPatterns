package com.observer.pattern.weather_application;

import java.util.logging.Logger;

public class StatisticsDisplay implements Observer, DisplayElement{
    private static final Logger LOGGER = Logger.getLogger(StatisticsDisplay.class.getName());
    private final WeatherData weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
        numReadings = 0;
    }

    @Override
    public void update() {
        tempSum += weatherData.getTemperature();
        numReadings++;

        maxTemp = Math.max(maxTemp, weatherData.getTemperature());
        minTemp = Math.min(minTemp, weatherData.getTemperature());

        display();
    }

    @Override
    public void display() {
        String msg = "Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp;
        LOGGER.info(msg);
    }
}
