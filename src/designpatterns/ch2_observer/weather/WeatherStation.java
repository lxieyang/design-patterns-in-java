package designpatterns.ch2_observer.weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weather);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weather);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weather);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weather);

        weather.setMeasurements(80, 65, 30.4f);
        System.out.println("\n");
        weather.setMeasurements(82, 70, 29.2f);
        System.out.println("\n");
        weather.setMeasurements(70, 90, 29.8f);
    }
}
