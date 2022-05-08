package example03;

public class ThermometerEx {
	
	public static void main(String[] args) {
		
		Thermometer ther = new Thermometer();
		
		ther.setChangable(new DigitalThermometer());
		ther.viewTemperature();
		
		ther.setChangable(new AnalogThermometer());
		ther.viewTemperature();
		
		
		// 익명 구현 객체 생성
		Thermometer.TemperaturChangable anonyTher = new Thermometer.TemperaturChangable() {
			
			int temperature = 200;
			
			@Override
			public void OnChange() {
				System.out.println("익명 구현객체로 만듦!");
				System.out.println("현재 온도 : " + this.temperature);;
			}
		};
		
		ther.setChangable(anonyTher);
		ther.viewTemperature();
	}

}
