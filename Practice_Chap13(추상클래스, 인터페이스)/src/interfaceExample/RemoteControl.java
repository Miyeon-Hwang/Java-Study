package interfaceExample;

public interface RemoteControl {
	
	// 상수
	// static final 속성(컴파일러 자동으로 적용)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	// 추상메서드
	// interface의 본질. abstract 속성(역시 컴파일러가 자동으로 적용(
	public void turnOn();
	public void turnOff();
	public void setVolume(int vol);
	
	
	// default method
	// 인터페이스에 수정이 필요할 때 기존 구현클래스에 영향을 미치지 않음.
	// 구현클래스에서 오버라이딩해서 사용하면 됨.
	public default void defaultMethod() {
		System.out.println("default 메서드 호출");
	}
	
	// 정적메서드
	// 기존에 알고있는 정적메서드랑 동일
	static void staticMethod() {
		System.out.println("static 메서드 호출");
	}
}
