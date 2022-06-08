package threadJoinExample;

public class JoinEx {

	public static void main(String[] args) {
		
		double avg = 0.0;
		long total = 0L;
		
		SumThread sumth = new SumThread();
		sumth.start();
		
		try {
			sumth.join();
		} catch (Exception e) {
		}
		
		// �� join �ڵ尡 ������ main, sum �����尡 ���ÿ� ����ǹǷ�
		// ���ϴ� ���� ������� ����.
		total = sumth.getSum();
		avg = total / 10000.0;
		System.out.println("total sum : " + total + ", avg : " + avg);
	
	}
}
