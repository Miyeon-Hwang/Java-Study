package createThreadExample;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	// main thread(main �Լ�)�� JVM�� ������.
	public static void main(String[] args) {
		
		// ��Ƽ������ ���� ���
		// 1. Runnable �������̽��� ������ Ŭ������ ��ü ���
//		Runnable runnable = new Beep();
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		
		// 2. Runnable �������̽� �͸�����ü ���
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i=0; i<5; i++) {
//					System.out.println("Beep ������ �̸� : " + 
//											Thread.currentThread().getName());
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		thread.start();
		
		
		// 3. ���ٽ�
		// �Լ��� �������̽�(�������̽��� �߻�޼��尡 �� ��)������ ����
//		Thread thread = new Thread(() -> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for (int i=0; i<5; i++) {
//				System.out.println("Beep ������ �̸� : " + 
//										Thread.currentThread().getName());
//				toolkit.beep();
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		thread.start();
		
		// 4. Thread ������ü ���
		Thread thread = new Beep2();
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("for���� �����ϴ� ������ �̸� : " + 
									Thread.currentThread().getName());
			System.out.println("beep!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// �ѹ� ����� thread�� ���� �Ұ�. �̹� terminated ���·� ��ȯ�Ǿ��⶧����.
		// IllegalThreadStateException �߻�
		//thread.start();
	
	}

}
