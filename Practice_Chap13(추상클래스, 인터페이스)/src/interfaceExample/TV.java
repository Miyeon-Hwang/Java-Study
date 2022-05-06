package interfaceExample;

public class TV implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int vol) {
		if (vol > MAX_VOLUME) {
			System.out.println("TV 볼륨의 최대치로 설정됩니다.");
			this.volume = MAX_VOLUME;
		}
		else if (vol < MIN_VOLUME) {
			System.out.println("TV 볼륨의 최소치로 설정됩니다.");
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume = vol;
		}
		
		System.out.println("TV 현재 볼륨 : " + this.volume);
	}

}
