package threadSynchronizedExample;

public class SynchronizedEx {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalculator(cal);
		
		User2 u2 = new User2();
		u2.setCalculator(cal);
		
		// 동기화가 안된 상태에서는 각 thread의 동작이 서로 영향을 미치므로 값이 뒤죽박죽. 출력값을 신뢰할 수 없음.
		// synchronized 키워드를 사용하여 스레드간 동기화를 해주면 공유객체에 lock이 걸리므로 user1 1-> 10, user2 15 -> 60 순서로 출력됨
		u1.start();
		u2.start();
		
	}

}
