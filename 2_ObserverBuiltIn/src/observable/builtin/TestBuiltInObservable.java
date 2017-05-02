package observable.builtin;

import observer.observable.builtIn.WeatherData;
import observer.observer.builtin.CurrentConditionsDisplay;

public class TestBuiltInObservable {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

		System.out.println("_________________________________________________");
		
		weatherData.setMeasurements(2.4f, 3.0f, 5.3f);
	}

}
