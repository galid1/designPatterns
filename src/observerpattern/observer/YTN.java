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
		forecast = "YTN ���Ư�� �Դϴ�." + "\n"
				+ "=============\n"
				+"���� �µ��� : " + temp + "�� �̰� \n"
				+"���� ������ : " + humidity + "�̸� \n"
				+"������ : " + cloudy;
		
		if(humidity <= 50 && cloudy <= 20)
			forecast += "�̹Ƿ� ���ڽ��ϴ�.";
		else
			forecast += "�Դϴ�.";
		
		System.out.println(forecast);
	}

}
