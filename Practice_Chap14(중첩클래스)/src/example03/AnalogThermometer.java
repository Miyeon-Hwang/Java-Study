package example03;

public class AnalogThermometer implements Thermometer.TemperaturChangable{

	int temperature = 100;
	
	@Override
	public void OnChange() {
		System.out.println("�Ƴ��α� �µ����Դϴ�");
		System.out.println("���� �µ� : " + this.temperature);
	}

}
