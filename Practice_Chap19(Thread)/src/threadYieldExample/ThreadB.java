package threadYieldExample;

public class ThreadB extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop) {
			try {
				if (work) {
					Thread.sleep(100);
					System.out.println("ThreadB의 작업내용");
				}
				else {
					System.out.println("ThreadB yield");
					Thread.yield(); // 다른 스레드에게 양보할 의사가 있음을 스케줄러에 알림. 호출 즉시 양보되는 건 아님. 양보하면서 Runnable 상태로 변경되므로 스케줄러에 의해 언제든 다시 호출됨.
					Thread.sleep(300);
				}
			}
			catch (Exception ex) {
			}
		}
		
		System.out.println("ThreadB 종료");
	}

}
