package net.mooctest;

public class WeatherCondition {
    private String weather; // e.g., "Clear", "Rainy", "Snowy"

    public WeatherCondition(String weather) {
        this.weather = weather;
    }

    public double adjustWeightForWeather(double originalWeight, Node node) {
        switch (weather) {
            case "Rainy":
                return originalWeight * 1.5; // Increase weight by 50% in rainy weather
            case "Snowy":
                return originalWeight * 2.0; // Double weight in snowy weather
            case "Stormy":
                return originalWeight * 3.0; // Higher weight in stormy weather
            default:
                return originalWeight; // No adjustment in clear or default weather
        }
    }
}
