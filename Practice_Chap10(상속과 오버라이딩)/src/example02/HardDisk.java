package example02;

public class HardDisk {
	
	// �������
	int capacity;
	int rpm;
	protected String name = "asdf";
	
	public HardDisk() { }
	
	public HardDisk(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	
	public void status() {
		System.out.println("HardDisk capa : " + this.capacity + ", rpm : " + this.rpm);
	}
	
	// fianl �����ڰ� ������ �ڼտ��� �������̵� �� �� ����
	public final void remove() {
		System.out.println("remove ȣ��");
		this.capacity = 0;
	}

}
