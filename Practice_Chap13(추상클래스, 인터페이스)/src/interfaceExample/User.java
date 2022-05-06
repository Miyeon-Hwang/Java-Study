package interfaceExample;

public class User {
	
	// 매개변수를 interface 타입으로 받으면 해당 interface의 구현클래스를 받을 수 있음
	public void setVolume(RemoteControl ctrl, int volume) {
		ctrl.setVolume(volume);
		System.out.println("매개변수로 넘어온 ctrl 주소 : " + ctrl);
	}


}
