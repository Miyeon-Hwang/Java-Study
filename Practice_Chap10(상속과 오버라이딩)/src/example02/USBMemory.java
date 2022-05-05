package example02;

public class USBMemory extends HardDisk{
	
	int port;
	
	// 자식 클래스의 모든 생성자에는 부모클래스 생성자, 즉 super() 가 있어야 함!
	// 매개변수가 있든없든 super()를 호출하지 않으면 기본생성자인 super()가 생략이 되어있는 상태
	// 이 때, 만약 HardDisk 클래스에 기본 생성자가 없으면 컴파일 에러가 발생함.
	public USBMemory() {} 
	
	public USBMemory(int capacity, int rpm, int port) {
		//super(capacity, rpm); // super() => 부모 클래스의 int 값 두 개를 매개변수로 받는 생성자 호출. 이게 선언이 안되어있으면 에러가 나겠지
		this.port = port;
	}
	
	// 오버로딩
	public void status(int i) {
		System.out.println("status() 오버로딩 " + i);
	}
	
	// 오버라이딩
	@Override
	public void status() {
		super.status(); // 조상 클래스의 멤버에 접근
		System.out.println("USBMemory capa : " + this.capacity + ", rpm : " + this.rpm + ", port : " + this.port);
		System.out.println(this.name); // 같은 클래스이고 상속 -> protected 접근자 접근 가능
	}
	
	//public void format() {} // 부모 클래스의 final method를 오버라이딩하려고하면 에러남!

}
