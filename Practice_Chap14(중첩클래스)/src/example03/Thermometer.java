package example03;

// ��ø �������̽� �ǽ�
public class Thermometer {
	
	interface TemperaturChangable {
		public void OnChange();
	}
	
	TemperaturChangable changable;
	
	// setter�� �Ű������� interface Ÿ���� ����.
	// ��, �ܺο��� TemperaturChangable �������̽��� ������ Ŭ������ setter�� �Ѱ��ְڴ�
	// �������̽� �Ű������� ������!!
	public void setChangable(TemperaturChangable changable) {
		this.changable = changable;
	}
	
	public void viewTemperature() {
		changable.OnChange();
	}
	
	

}
