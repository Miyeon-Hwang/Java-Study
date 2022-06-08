package threadWaitNotifyExample;

public class WaitNotifyEx {

	public static void main(String[] args) throws InterruptedException {
		
		WorkObject wo = new WorkObject();
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		
		// ����ȭ �޼ҵ� A,B�� wait, notify�� ���� ������ ���鼭 �۾��� ó���ϰ� ��.
		ta.start();
		tb.start();
		
		Thread.sleep(1000);
		
		while (true) {
			Thread.sleep(300);
			// ThreadA, ThreadB run()���� system.exit()�� ������ ������ �� ������� ������� ���ϰ� waiting ���·� ���� �ǹǷ� ���α׷��� ������� ����.
			// ThreadA�� ����ǰ� ThreadB�� waiting ���·� ���� ��쿡�� ThreadA���� exit()�� ȣ��ǰ� ���α׷� ����Ǵ� ��.
			// ���� ���� ��������� �����ٷ��� ���� �Ŵϱ� ���⼭�� �Ѵ� exit() ���ִ� �ɷ� 
			System.out.println("ThreadA�� ���� : " + ta.getState());
			System.out.println("ThreadB�� ���� : " + tb.getState());
		}

	}
}
