package createThreadExample;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	// main thread(main 함수)는 JVM이 실행함.
	public static void main(String[] args) {
		
		// 멀티스레드 생성 방법
		// 1. Runnable 인터페이스를 구현한 클래스의 객체 사용
//		Runnable runnable = new Beep();
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		
		// 2. Runnable 인터페이스 익명구현객체 사용
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i=0; i<5; i++) {
//					System.out.println("Beep 스레드 이름 : " + 
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
		
		
		// 3. 람다식
		// 함수적 인터페이스(인터페이스의 추상메서드가 한 개)에서만 가능
//		Thread thread = new Thread(() -> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for (int i=0; i<5; i++) {
//				System.out.println("Beep 스레드 이름 : " + 
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
		
		// 4. Thread 구현객체 사용
		Thread thread = new Beep2();
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("for문을 실행하는 스레드 이름 : " + 
									Thread.currentThread().getName());
			System.out.println("beep!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 한번 실행된 thread는 재사용 불가. 이미 terminated 상태로 전환되었기때문에.
		// IllegalThreadStateException 발생
		//thread.start();
	
	}

}
