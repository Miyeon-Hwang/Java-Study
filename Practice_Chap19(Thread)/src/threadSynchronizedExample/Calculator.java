package threadSynchronizedExample;

public class Calculator { // 공유 객체
	
	private int val; // 공유 자원
	
	public int getVal() {
		return val;
	}
	
	// 동기화 메서드. 메서드 잠금이 일어남.
	public synchronized void addVal(int i, int repeat) {
		for (int r=0; r<repeat; r++) {
			this.val += i; // 공유 자원에 접근
			System.out.println(Thread.currentThread().getName() + "스레드 val 값 : " + this.val);
		}
	}
	
//	public void addVal(int i, int repeat) {
//		for (int r=0; r<repeat; r++) {
//			this.val += i;
//			System.out.println(Thread.currentThread().getName() + "스레드 val 값 : " + this.val);
//		}
//	}

}
