package example03;

// 중첩 인터페이스 실습
public class Thermometer {
	
	interface TemperaturChangable {
		public void OnChange();
	}
	
	TemperaturChangable changable;
	
	// setter의 매개변수로 interface 타입이 들어옴.
	// 즉, 외부에서 TemperaturChangable 인터페이스를 구현한 클래스를 setter로 넘겨주겠다
	// 인터페이스 매개변수의 다형성!!
	public void setChangable(TemperaturChangable changable) {
		this.changable = changable;
	}
	
	public void viewTemperature() {
		changable.OnChange();
	}
	
	

}
