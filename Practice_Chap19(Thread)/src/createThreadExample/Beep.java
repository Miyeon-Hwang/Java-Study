package createThreadExample;

import java.awt.Toolkit;

public class Beep implements Runnable{

	@Override
	public void run() {
		// Toolkit�� AWT(Abstract Window Toolkit) �߻�Ŭ����
		// GUI ���� �޼���� ������ �ν��Ͻ��� getDefaultToolkit()���� ������.
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
