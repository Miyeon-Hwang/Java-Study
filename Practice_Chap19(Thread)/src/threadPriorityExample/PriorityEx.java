package threadPriorityExample;

// �ڹ� CPU �����ٷ� ��� -> ��ȯ�Ҵ�(Round-Robin) ���
// Priority ������� ������ ���� ����
// MAX_PRIORITY(10)���� �����Ѵٰ� �ص� ���� �۾��� ��ĥ ���ɼ��� ���� �� 100% ���� �������� ����
public class PriorityEx {
	public static void main(String[] args) {
	
		System.out.println("main thread�� priority : " + Thread.currentThread().getPriority());
		
		for (int i=1; i<=10; i++) {
			Thread th = new CalcThread("CalcThread" + i);
			
			if (i != 10) {
				th.setPriority(Thread.MIN_PRIORITY);
			}
			else {
				th.setPriority(Thread.MAX_PRIORITY);
			}
			
			th.start();
		}
		
	}

}
