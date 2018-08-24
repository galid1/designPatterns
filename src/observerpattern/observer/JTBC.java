package observerpattern.observer;

public class JTBC implements Observer, Forecast {

	private int temp, humidity, cloudy;
	
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
		System.out.println("JTBC ���Ư�� �Դϴ�." + "\n"
				+ "=============\n"
				+"���� �µ��� : " + temp + "�� �̸� \n"
				+"���� ������ : " + humidity + "�Դϴ�.");
	}

}
