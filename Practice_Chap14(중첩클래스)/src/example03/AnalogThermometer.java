package example03;

public class AnalogThermometer implements Thermometer.TemperaturChangable{

	int temperature = 100;
	
	@Override
	public void OnChange() {
		System.out.println("아날로그 온도계입니다");
		System.out.println("현재 온도 : " + this.temperature);
	}

}
