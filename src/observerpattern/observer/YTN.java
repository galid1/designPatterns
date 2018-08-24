package observerpattern.observer;

public class YTN implements Observer, Forecast {
	
	private int temp, humidity, cloudy;
	private String forecast;
	
	@Override
	public void update(int temp, int humidity, int cloudy) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.cloudy = cloudy;
		
		forecast();
	}

	@Override
	public void forecast() {
		// TODO Auto-generated method stub
		forecast = "YTN 기상특보 입니다." + "\n"
				+ "=============\n"
				+"현재 온도는 : " + temp + "도 이고 \n"
				+"현재 습도는 : " + humidity + "이며 \n"
				+"구름은 : " + cloudy;
		
		if(humidity <= 50 && cloudy <= 20)
			forecast += "이므로 맑겠습니다.";
		else
			forecast += "입니다.";
		
		System.out.println(forecast);
	}

}
