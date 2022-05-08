package example03;

public class ThermometerEx {
	
	public static void main(String[] args) {
		
		Thermometer ther = new Thermometer();
		
		ther.setChangable(new DigitalThermometer());
		ther.viewTemperature();
		
		ther.setChangable(new AnalogThermometer());
		ther.viewTemperature();
		
		
		// �͸� ���� ��ü ����
		Thermometer.TemperaturChangable anonyTher = new Thermometer.TemperaturChangable() {
			
			int temperature = 200;
			
			@Override
			public void OnChange() {
				System.out.println("�͸� ������ü�� ����!");
				System.out.println("���� �µ� : " + this.temperature);;
			}
		};
		
		ther.setChangable(anonyTher);
		ther.viewTemperature();
	}

}
