package observer.custom.observerinterfaceimpl;

import observer.custom.displayInterface.DisplayElement;
import observer.custom.observableinterface.Subject;
import observer.custom.observerinterface.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressue(float pressue) {
		this.pressure = pressue;
	}

	@Override
	public void update(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + temperature + "/" + temperature + "/" + temperature);

	}

}
