package observerpattern.main;

import observerpattern.observer.JTBC;
import observerpattern.observer.MBC;
import observerpattern.observer.YTN;
import observerpattern.subject.WeatherStation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YTN ytn = new YTN();
		JTBC jtbc = new JTBC();
		MBC mbc = new MBC();
		
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.addObserver(ytn);
		weatherStation.addObserver(jtbc);
		weatherStation.addObserver(mbc);
		
		weatherStation.dataChanged(25, 11, 13);
	}

}
