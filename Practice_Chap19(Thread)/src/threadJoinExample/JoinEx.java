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
		
		// 위 join 코드가 없으면 main, sum 스레드가 동시에 진행되므로
		// 원하는 값을 출력하지 않음.
		total = sumth.getSum();
		avg = total / 10000.0;
		System.out.println("total sum : " + total + ", avg : " + avg);
	
	}
}
