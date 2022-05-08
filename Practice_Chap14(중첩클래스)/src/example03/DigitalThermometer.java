package example03;

// 중첩인터페이스 구현
public class DigitalThermometer implements Thermometer.TemperaturChangable{

	int temperature = 50;
	
	@Override
	public void OnChange() {
		System.out.println("전자 온도계입니다");
		System.out.println("현재 온도 : " + this.temperature);
	}

}
