package example03;

// ��ø�������̽� ����
public class DigitalThermometer implements Thermometer.TemperaturChangable{

	int temperature = 50;
	
	@Override
	public void OnChange() {
		System.out.println("���� �µ����Դϴ�");
		System.out.println("���� �µ� : " + this.temperature);
	}

}
