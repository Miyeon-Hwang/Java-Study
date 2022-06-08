package threadWaitNotifyExample;

public class ThreadA extends Thread {
	
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			workObject.methodA();
		}
		System.out.println("ThreadA Á¾·á");
		//System.exit(0);
	}
}
