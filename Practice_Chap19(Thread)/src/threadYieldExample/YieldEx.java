package threadYieldExample;

public class YieldEx {
	
	public static void main(String[] args) throws Exception {
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		Thread.sleep(2000); // 2�ʵ��� ThreadA,ThreadB�� ������ ���� work true �۾�(CPU �����ٷ�)
		System.out.println("===================================");
		
		// ThreadA yield ȣ��(�����ٷ��� �纸�ϰڴٴ� �ǻ縦 ������ ��. �纸 100% ������ �ƴ�)
		// Runnable ������ ThreadB�� �纸�ϴ� ������ ����
		// �纸�ϰ� ThreadA�� Runnable ���·� �ٲ�� ���̹Ƿ� �����ٷ��� ���� �ٽ� ȣ���.
		ta.work = false;
		
		Thread.sleep(2000);
		System.out.println("===================================");
		
		
		// �� ��Ȳ�� �ݴ�(ThreadB�� �����ٷ��� �纸 �ǻ縦 �����ϴ� ��) 
		ta.work = true;
		tb.work = false;
		
		Thread.sleep(2000);
		System.out.println("===================================");
		
		ta.stop = true;
		tb.stop = true;
	}

}
