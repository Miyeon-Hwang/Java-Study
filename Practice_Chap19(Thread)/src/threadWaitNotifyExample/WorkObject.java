package threadWaitNotifyExample;

public class WorkObject {
	
	// wait(), notify(), notifyAll()�� ����ȭ �޼���/�������� ��밡����
	// ������ ���� ���� �����ư��� �۾��� ó���ؾ� �ϴ� ��� ���
	// ���� ���ʰ� �ƴ� ���ȿ� �����尡 ��� ���°� �ƴ϶� ��� ���� �����ٰ� ��ȣ�� ���� ������ ���·� ��������
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() ����");
		notify(); // object ���� wait()�� ���� BLOCKED �� �����尡 �ִٸ� �� �� �ϳ��� ������ ���·� ����
		
		try {
			wait(); // ������ ��� ���·� ����(�ٸ� �����忡�� notify()�� ȣ���� ������)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() ����");
		notify(); // wait()�� ���� BLOCKED �� �����带 ������ ���·� ����
		
		try {
			wait(); // ������ ��� ���·� ����(�ٸ� �����忡�� notify()�� ȣ���� ������)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
