package threadGroupInterruptExample;

public class ThreadGroupEx {
	
	public static void main(String[] args) {
		
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();
		System.out.println("MAIN �׷� �̸� : " + threadGroup1);
		
		// MainGroup�� ���� ������ �׷����� �������.
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread threadA = new WorkThread(myGroup, "workThreadA");
		WorkThread threadB = new WorkThread(myGroup, "workThreadB");
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		
		System.out.println("[���� ������ �׷��� list() �޼��� ȣ�� ���]");
		mainGroup1.list();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		// ������ �׷쿡 ���� �����忡 �ѹ��� Interrupt() ȣ�� ����
		myGroup.interrupt();
		
		// �����尡 ���� or ������ ������ �� �Ʒ�ó�� interrupt ���θ� Ȯ���ؼ� ó���� ���� ����.
		// threadA.isInterrupted()
		
	}

}
