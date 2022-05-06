package interfaceExample;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");
		
	}

	@Override
	public void setVolume(int vol) {
		if (vol > MAX_VOLUME) {
			System.out.println("Audio ������ �ִ�ġ�� �����˴ϴ�.");
			this.volume = MAX_VOLUME;
		}
		else if (vol < MIN_VOLUME) {
			System.out.println("Audio ������ �ּ�ġ�� �����˴ϴ�.");
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume = vol;
		}
		
		System.out.println("Audio ���� ���� : " + this.volume);
	}

}
