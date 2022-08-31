package com.observer.pattern.weather_application;

import java.util.logging.Logger;

public class ForecastDisplay implements Observer, DisplayElement{
    private static final Logger LOGGER = Logger.getLogger(ForecastDisplay.class.getName());
    private float currentPressure = 29.92f;
    private float lastPressure;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        LOGGER.info("Forecast: ");
        if (currentPressure > lastPressure) {
            LOGGER.info("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            LOGGER.info("More of the same");
        } else {
            LOGGER.info("Watch out for cooler, rainy weather");
        }
    }
}
