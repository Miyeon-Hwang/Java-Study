package interfaceExample;

public interface RemoteControl {
	
	// ���
	// static final �Ӽ�(�����Ϸ� �ڵ����� ����)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	// �߻�޼���
	// interface�� ����. abstract �Ӽ�(���� �����Ϸ��� �ڵ����� ����(
	public void turnOn();
	public void turnOff();
	public void setVolume(int vol);
	
	
	// default method
	// �������̽��� ������ �ʿ��� �� ���� ����Ŭ������ ������ ��ġ�� ����.
	// ����Ŭ�������� �������̵��ؼ� ����ϸ� ��.
	public default void defaultMethod() {
		System.out.println("default �޼��� ȣ��");
	}
	
	// �����޼���
	// ������ �˰��ִ� �����޼���� ����
	static void staticMethod() {
		System.out.println("static �޼��� ȣ��");
	}
}
