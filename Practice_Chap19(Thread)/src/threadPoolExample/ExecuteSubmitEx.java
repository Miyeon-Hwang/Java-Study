package threadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitEx {
	
	public static void main(String[] args) {
		
		// 스레드 풀 생성하기
		ExecutorService exe = Executors.newFixedThreadPool(3);
		
		for (int i=0; i<20; i++) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// newFixedThreadPool()나 newCachedThreadPool()로 스레드 풀을 생성하면
					// 내부에서 ThreadPoolExecutor로 생성되기 때문에 아래처럼 캐스팅 가능
					ThreadPoolExecutor tpe = (ThreadPoolExecutor)exe;

					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("총 스레드 수 : "+ poolSize + ", "
											+ "작업 스레드 이름 : " + threadName);					
				
					// 일부러 예외 발생시키기 (execute(), submit() 차이 확인하기 위해)
					//Integer.parseInt("aaa");
				}
			};
			
			// 스레드 풀 작업 큐에 runnable 객체를 넣는 메서드 : execute(), submit()
			// execute()는 처리중 예외가 발생하면 해당 스레드를 종료하고 풀에서 제거한다.
			// submit()은 예외가 발생하더라도 해당 스레드를 풀에서 제거하지 않고 재사용한다(CPU, 메모리 부하가 덜 함)
			//exe.execute(runnable);
			exe.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			
			exe.shutdown(); // 스레드 풀 종료. 작업 큐에 있는 모든 작업을 마무리한 후에 종료한다.
		}
	}

}
