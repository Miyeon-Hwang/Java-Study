package threadNameExample;

public class ThreadB extends Thread {
	
	public ThreadB() {
		this.setName("ThreadB"); // ������ �̸� ����
	}
	
	@Override
	public void run() {
		System.out.println("������ �� : " + this.getName());
		for (int i=0; i<5; i++) { 
			System.out.println(this.getName() + "�� ����� ���� : " + i );
		}
	}

}
