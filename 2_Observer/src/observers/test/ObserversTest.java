package observers.test;

import observer.custom.observableinterfaceimpl.WeatherData;
import observer.custom.observerinterfaceimpl.CurrentConditionsDisplay;
import observer.custom.observerinterfaceimpl.ForecastDisplay;
import observer.custom.observerinterfaceimpl.StatisticsDisplay;

public class ObserversTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

		ForecastDisplay fcd = new ForecastDisplay(weatherData);
		StatisticsDisplay sd = new StatisticsDisplay(weatherData);
		weatherData.setMeasurement(98.4f, 35.0f, 45.3f);

		System.out.println("_________________________________________________");
		
		weatherData.setMeasurement(2.4f, 3.0f, 5.3f);

	}
}
