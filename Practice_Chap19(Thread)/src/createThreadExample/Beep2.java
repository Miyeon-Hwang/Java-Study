package createThreadExample;

import java.awt.Toolkit;

// Thread 클래스는 Runnable 인터페이스를 구현하고 있음
// Thread 클래스를 상속하는 클래스를 만들어서 멀티 스레드 구현
public class Beep2 extends Thread {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			System.out.println("Beep 스레드 이름 : " + 
									Thread.currentThread().getName());
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
