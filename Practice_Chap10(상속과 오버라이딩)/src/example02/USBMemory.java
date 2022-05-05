package example02;

public class USBMemory extends HardDisk{
	
	int port;
	
	// �ڽ� Ŭ������ ��� �����ڿ��� �θ�Ŭ���� ������, �� super() �� �־�� ��!
	// �Ű������� �ֵ���� super()�� ȣ������ ������ �⺻�������� super()�� ������ �Ǿ��ִ� ����
	// �� ��, ���� HardDisk Ŭ������ �⺻ �����ڰ� ������ ������ ������ �߻���.
	public USBMemory() {} 
	
	public USBMemory(int capacity, int rpm, int port) {
		//super(capacity, rpm); // super() => �θ� Ŭ������ int �� �� ���� �Ű������� �޴� ������ ȣ��. �̰� ������ �ȵǾ������� ������ ������
		this.port = port;
	}
	
	// �����ε�
	public void status(int i) {
		System.out.println("status() �����ε� " + i);
	}
	
	// �������̵�
	@Override
	public void status() {
		super.status(); // ���� Ŭ������ ����� ����
		System.out.println("USBMemory capa : " + this.capacity + ", rpm : " + this.rpm + ", port : " + this.port);
		System.out.println(this.name); // ���� Ŭ�����̰� ��� -> protected ������ ���� ����
	}
	
	//public void format() {} // �θ� Ŭ������ final method�� �������̵��Ϸ����ϸ� ������!

}
