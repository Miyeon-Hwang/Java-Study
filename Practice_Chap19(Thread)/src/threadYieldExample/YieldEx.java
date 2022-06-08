package threadYieldExample;

public class YieldEx {
	
	public static void main(String[] args) throws Exception {
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		Thread.sleep(2000); // 2초동안 ThreadA,ThreadB가 번갈아 가며 work true 작업(CPU 스케줄러)
		System.out.println("===================================");
		
		// ThreadA yield 호출(스케줄러에 양보하겠다는 의사를 밝히는 것. 양보 100% 보장은 아님)
		// Runnable 상태인 ThreadB로 양보하는 경향이 생김
		// 양보하고 ThreadA도 Runnable 상태로 바뀌는 것이므로 스케줄러에 의해 다시 호출됨.
		ta.work = false;
		
		Thread.sleep(2000);
		System.out.println("===================================");
		
		
		// 위 상황과 반대(ThreadB가 스케줄러에 양보 의사를 전달하는 것) 
		ta.work = true;
		tb.work = false;
		
		Thread.sleep(2000);
		System.out.println("===================================");
		
		ta.stop = true;
		tb.stop = true;
	}

}
