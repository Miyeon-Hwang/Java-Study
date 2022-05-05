package singleton;

public class User {
	// 싱글톤 패턴 사용이유
	// 하나의 인스턴스를 생성해서 공유를 원하고자 할때 사용
	// ex) 사용자 환경설정, 커넥션풀(?), 스레드풀 등	
	
	// 1. 외부에서 접근하지 못하게 private로, class가 하나의 instance를 가질 수 있도록 static 멤버를 선언.
	private static User singleton = new User();
	int cnt = 0;
	
	// 2. 외부에서 new 연산자로 인스턴스 생성하지 못하도록 private 생성자 만듦
	private User() {}
	
	// 3. 해당 클래스의 singleton instance를 넘겨주기 위해 외부에서 호출할 수 있는 public static getter 메서드를 제공.
	public static User getSingleton() {
		return singleton;
	}
	
	public void add() {
		System.out.println("add 호출. cnt : " + (++cnt));
	}

}
