package com.observer.pattern.weather_application;

import java.util.logging.Logger;

public class WorkStation {
    private static final Logger LOGGER = Logger.getLogger(WorkStation.class.getName());

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        LOGGER.info("Change 1...");
        weatherData.setMeasurements(80, 65, 30.4f);
        LOGGER.info("Change 2...");
        weatherData.setMeasurements(82, 70, 29.2f);
        LOGGER.info("Change 3...");
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        LOGGER.info("Change 4...");
        weatherData.setMeasurements(62, 90, 28.1f);

        weatherData.removeObserver(currentConditionDisplay);
        LOGGER.info("Change 5...");
        weatherData.setMeasurements(66, 88, 28.7f);
        weatherData.removeObserver(statisticsDisplay);
    }
}
