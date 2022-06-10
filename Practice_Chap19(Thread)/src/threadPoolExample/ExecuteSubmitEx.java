package threadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitEx {
	
	public static void main(String[] args) {
		
		// ������ Ǯ �����ϱ�
		ExecutorService exe = Executors.newFixedThreadPool(3);
		
		for (int i=0; i<20; i++) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// newFixedThreadPool()�� newCachedThreadPool()�� ������ Ǯ�� �����ϸ�
					// ���ο��� ThreadPoolExecutor�� �����Ǳ� ������ �Ʒ�ó�� ĳ���� ����
					ThreadPoolExecutor tpe = (ThreadPoolExecutor)exe;

					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("�� ������ �� : "+ poolSize + ", "
											+ "�۾� ������ �̸� : " + threadName);					
				
					// �Ϻη� ���� �߻���Ű�� (execute(), submit() ���� Ȯ���ϱ� ����)
					//Integer.parseInt("aaa");
				}
			};
			
			// ������ Ǯ �۾� ť�� runnable ��ü�� �ִ� �޼��� : execute(), submit()
			// execute()�� ó���� ���ܰ� �߻��ϸ� �ش� �����带 �����ϰ� Ǯ���� �����Ѵ�.
			// submit()�� ���ܰ� �߻��ϴ��� �ش� �����带 Ǯ���� �������� �ʰ� �����Ѵ�(CPU, �޸� ���ϰ� �� ��)
			//exe.execute(runnable);
			exe.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			
			exe.shutdown(); // ������ Ǯ ����. �۾� ť�� �ִ� ��� �۾��� �������� �Ŀ� �����Ѵ�.
		}
	}

}
