package threadStatusExample;

public class StatePrintThread extends Thread {

	private TargetThread target;
	
	public StatePrintThread(TargetThread target) {
		this.target = target;
	}
	
	@Override
	public void run() {
		while (true) {
			
			// 스레드 상태 Enum 타입 - Thread.State
			Thread.State state = target.getState();
			System.out.println("state : " + state);
			
			if (state == Thread.State.NEW) {
				target.start();
			}
			
			if (state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
