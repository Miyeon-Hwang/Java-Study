package threadNameExample;

public class ThreadNameEx {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread thread1 = new ThreadA();
		Thread thread2 = new ThreadB();
		thread1.start();
		thread2.start();
		
		// ��� ������ CPU �����ٷ��� ���� ���Ƿ� �������� ������ ������ ������ �޶���.
	}

}
