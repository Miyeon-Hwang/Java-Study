package example02;

public class HardDisk {
	
	// 멤버변수
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
	
	// fianl 제어자가 붙으면 자손에서 오버라이딩 할 수 없음
	public final void remove() {
		System.out.println("remove 호출");
		this.capacity = 0;
	}

}
