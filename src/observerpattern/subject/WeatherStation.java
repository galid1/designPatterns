package observerpattern.subject;

import java.util.ArrayList;

import observerpattern.observer.Observer;

public class WeatherStation implements Subject{

	private ArrayList<Observer> observerList;
	
	private int temp, humidity, cloudy;
	
	public WeatherStation() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int i = observerList.indexOf(observer);
		
		if(i >= 0)
			observerList.remove(i);
	}

	@Override
	public void dataChanged(int temp, int humidity, int cloudy) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.cloudy = cloudy;
		
		notifyObservers();
	}
	
	public void notifyObservers() {
		for(Observer observer : observerList) 
			observer.update(temp, humidity, cloudy);
	}


}
