package threadSynchronizedExample;

public class Calculator { // ���� ��ü
	
	private int val; // ���� �ڿ�
	
	public int getVal() {
		return val;
	}
	
	// ����ȭ �޼���. �޼��� ����� �Ͼ.
	public synchronized void addVal(int i, int repeat) {
		for (int r=0; r<repeat; r++) {
			this.val += i; // ���� �ڿ��� ����
			System.out.println(Thread.currentThread().getName() + "������ val �� : " + this.val);
		}
	}
	
//	public void addVal(int i, int repeat) {
//		for (int r=0; r<repeat; r++) {
//			this.val += i;
//			System.out.println(Thread.currentThread().getName() + "������ val �� : " + this.val);
//		}
//	}

}
