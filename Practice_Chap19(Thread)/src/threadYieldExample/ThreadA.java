package threadYieldExample;

public class ThreadA extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop) {
			try {
				if (work) {
					Thread.sleep(100);
					System.out.println("ThreadA�� �۾�����");
				}
				else {
					System.out.println("ThreadA yield");
					Thread.yield();  // �ٸ� �����忡�� �纸�� �ǻ簡 ������ �����ٷ��� �˸�. ȣ�� ��� �纸�Ǵ� �� �ƴ�. �纸�ϸ鼭 Runnable ���·� ����ǹǷ� �����ٷ��� ���� ������ �ٽ� ȣ���.
					Thread.sleep(300);
				}
			}
			catch (Exception ex) {
			}
		}
		
		System.out.println("ThreadA ����");
	}

}
