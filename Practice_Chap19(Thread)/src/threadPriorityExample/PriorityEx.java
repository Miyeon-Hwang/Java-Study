package threadPriorityExample;

// 자바 CPU 스케줄러 방식 -> 순환할당(Round-Robin) 방식
// Priority 방식으로 설정할 수는 있음
// MAX_PRIORITY(10)으로 설정한다고 해도 먼저 작업을 마칠 가능성이 높을 뿐 100% 먼저 끝나지는 않음
public class PriorityEx {
	public static void main(String[] args) {
	
		System.out.println("main thread의 priority : " + Thread.currentThread().getPriority());
		
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
