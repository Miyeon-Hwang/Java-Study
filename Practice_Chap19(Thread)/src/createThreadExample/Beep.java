package createThreadExample;

import java.awt.Toolkit;

public class Beep implements Runnable{

	@Override
	public void run() {
		// Toolkit은 AWT(Abstract Window Toolkit) 추상클래스
		// GUI 관련 메서드로 구성된 인스턴스를 getDefaultToolkit()으로 참조함.
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
