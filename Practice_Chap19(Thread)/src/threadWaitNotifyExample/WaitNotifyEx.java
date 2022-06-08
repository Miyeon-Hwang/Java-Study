package threadWaitNotifyExample;

public class WaitNotifyEx {

	public static void main(String[] args) throws InterruptedException {
		
		WorkObject wo = new WorkObject();
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		
		// 동기화 메소드 A,B가 wait, notify를 통해 번갈아 가면서 작업을 처리하게 됨.
		ta.start();
		tb.start();
		
		Thread.sleep(1000);
		
		while (true) {
			Thread.sleep(300);
			// ThreadA, ThreadB run()에서 system.exit()를 해주지 않으면 한 쓰레드는 종료되지 못하고 waiting 상태로 남게 되므로 프로그램이 종료되지 못함.
			// ThreadA가 종료되고 ThreadB가 waiting 상태로 남는 경우에는 ThreadA에서 exit()이 호출되고 프로그램 종료되는 것.
			// 뭐가 먼저 종료될지는 스케줄러에 의한 거니까 여기서는 둘다 exit() 해주는 걸로 
			System.out.println("ThreadA의 상태 : " + ta.getState());
			System.out.println("ThreadB의 상태 : " + tb.getState());
		}

	}
}
