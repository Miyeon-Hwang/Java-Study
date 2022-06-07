package threadNameExample;

public class ThreadNameEx {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread thread1 = new ThreadA();
		Thread thread2 = new ThreadB();
		thread1.start();
		thread2.start();
		
		// 출력 순서는 CPU 스케줄러에 의해 임의로 정해지기 때문에 실행할 때마다 달라짐.
	}

}
