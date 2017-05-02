package observer.observer.builtin;

import java.util.Observable;
import java.util.Observer;

import observer.displayinterface.DisplayElement;
import observer.observable.builtIn.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	public Observable observable;

	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData wd = (WeatherData) o;
			temperature = wd.getTemperature();
			humidity = wd.getHumidity();
			pressure = wd.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current condidtions:" + temperature + "F degress and " + humidity + "% humidity");
	}

}
