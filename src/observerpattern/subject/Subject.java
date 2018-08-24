package observerpattern.subject;

import observerpattern.observer.Observer;

public interface Subject {
	
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void dataChanged(int temp, int humidity, int cloudy);
	
}
