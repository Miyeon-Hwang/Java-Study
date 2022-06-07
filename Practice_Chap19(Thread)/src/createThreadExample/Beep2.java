package createThreadExample;

import java.awt.Toolkit;

// Thread Ŭ������ Runnable �������̽��� �����ϰ� ����
// Thread Ŭ������ ����ϴ� Ŭ������ ���� ��Ƽ ������ ����
public class Beep2 extends Thread {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			System.out.println("Beep ������ �̸� : " + 
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
