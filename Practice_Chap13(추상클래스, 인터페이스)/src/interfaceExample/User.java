package interfaceExample;

public class User {
	
	// �Ű������� interface Ÿ������ ������ �ش� interface�� ����Ŭ������ ���� �� ����
	public void setVolume(RemoteControl ctrl, int volume) {
		ctrl.setVolume(volume);
		System.out.println("�Ű������� �Ѿ�� ctrl �ּ� : " + ctrl);
	}


}
