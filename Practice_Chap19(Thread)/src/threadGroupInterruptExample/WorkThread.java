package threadGroupInterruptExample;

public class WorkThread extends Thread {
	
	public WorkThread(ThreadGroup threadgroup, String threadname) {
		super(threadgroup, threadname);
	}
	
	@Override
	public void run() {
		ThreadGroup maingroup = Thread.currentThread().getThreadGroup();
		String str = maingroup.getName();
		System.out.println("thread group 이름 : " + str);
		
		while (true) {
			try {
				Thread.sleep(1000); // 대기상태
			} 
			// thread가 대기 상태이므로 InterruptedException으로 Interrupt catch
			// 실행 or 실행대기 상태일때는 InterruptedException 발생하지 않으므로
			// static method Thread.interrupted() 이나 외부에서 인스턴스 메서드 objThread.isInterrupted()로 interrupt catch하고 빠져나올 수 있음 
			catch (InterruptedException e) {
				System.out.println(this.getName() + " interrupt 호출됨!");
				break;
			}
		}
		
		System.out.println(this.getName() + " 종료됨!");
	}
	

}
