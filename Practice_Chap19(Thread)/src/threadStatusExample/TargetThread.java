package threadStatusExample;

public class TargetThread extends Thread {
	
	@Override
	public void run() {
		
		// RUNNABLE
		for (long i=0; i<Math.pow(2, 25); i++) {
		}
		
		// TIMED_WAITING
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// RUNNABLE
		for (long i=0; i<Math.pow(2, 25); i++) {
		}
	}

}
