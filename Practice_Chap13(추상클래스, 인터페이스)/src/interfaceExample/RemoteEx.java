package interfaceExample;

public class RemoteEx {
	
	public static void main(String[] args) {
		
		// ������! interface�� ����Ŭ����(�ڽ�)�� ���� �� ����. 
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
		// interface ������ �Ű����� ���� (returnŸ��, �迭�� �����ϰ� ����)
		User user = new User();
		System.out.println(ctrl2);
		user.setVolume(ctrl2, 5);
		
		System.out.println();
		
		System.out.println(ctrl1);
		user.setVolume(ctrl1, 20);
		
	}

}
