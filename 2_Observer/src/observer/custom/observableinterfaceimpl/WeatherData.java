package observer.custom.observableinterfaceimpl;

import java.util.ArrayList;
import java.util.List;

import observer.custom.observableinterface.Subject;
import observer.custom.observerinterface.Observer;

public class WeatherData implements Subject {
	private List<Observer> observers ;
	private float temperature;
	private float humidity;
	private float pressure;
	public WeatherData(){
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		for(Observer o:observers){
			o.update(temperature, humidity, pressure);
		}

	}
	
	public void measurementsChanged(){
		this.notifyObservers();
	}
	
	public void setMeasurement(final float temperature, final float humidity, final float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
