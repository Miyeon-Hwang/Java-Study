package threadGroupInterruptExample;

public class WorkThread extends Thread {
	
	public WorkThread(ThreadGroup threadgroup, String threadname) {
		super(threadgroup, threadname);
	}
	
	@Override
	public void run() {
		ThreadGroup maingroup = Thread.currentThread().getThreadGroup();
		String str = maingroup.getName();
		System.out.println("thread group �̸� : " + str);
		
		while (true) {
			try {
				Thread.sleep(1000); // ������
			} 
			// thread�� ��� �����̹Ƿ� InterruptedException���� Interrupt catch
			// ���� or ������ �����϶��� InterruptedException �߻����� �����Ƿ�
			// static method Thread.interrupted() �̳� �ܺο��� �ν��Ͻ� �޼��� objThread.isInterrupted()�� interrupt catch�ϰ� �������� �� ���� 
			catch (InterruptedException e) {
				System.out.println(this.getName() + " interrupt ȣ���!");
				break;
			}
		}
		
		System.out.println(this.getName() + " �����!");
	}
	

}
