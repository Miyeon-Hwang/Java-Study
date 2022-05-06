package interfaceExample;

public class TV implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
		
	}

	@Override
	public void setVolume(int vol) {
		if (vol > MAX_VOLUME) {
			System.out.println("TV ������ �ִ�ġ�� �����˴ϴ�.");
			this.volume = MAX_VOLUME;
		}
		else if (vol < MIN_VOLUME) {
			System.out.println("TV ������ �ּ�ġ�� �����˴ϴ�.");
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume = vol;
		}
		
		System.out.println("TV ���� ���� : " + this.volume);
	}

}
