package interfaceExample;

public class RemoteEx {
	
	public static void main(String[] args) {
		
		// 다형성! interface도 구현클래스(자식)를 받을 수 있음. 
		RemoteControl ctrl1 = new Audio();
		ctrl1.turnOn();
		ctrl1.setVolume(14);
		ctrl1.turnOff();
		
		System.out.println();
		
		RemoteControl ctrl2 = new TV();
		ctrl2.turnOn();
		ctrl2.setVolume(-3);
		
		ctrl2.defaultMethod();
		RemoteControl.staticMethod();
		
		System.out.println("===========================");
		// interface 다형성 매개변수 적용 (return타입, 배열도 동일하게 가능)
		User user = new User();
		System.out.println(ctrl2);
		user.setVolume(ctrl2, 5);
		
		System.out.println();
		
		System.out.println(ctrl1);
		user.setVolume(ctrl1, 20);
		
	}

}
