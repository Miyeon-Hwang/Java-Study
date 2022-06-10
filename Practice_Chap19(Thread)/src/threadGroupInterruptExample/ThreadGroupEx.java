package threadGroupInterruptExample;

public class ThreadGroupEx {
	
	public static void main(String[] args) {
		
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();
		System.out.println("MAIN 그룹 이름 : " + threadGroup1);
		
		// MainGroup의 하위 스레드 그룹으로 만들어짐.
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread threadA = new WorkThread(myGroup, "workThreadA");
		WorkThread threadB = new WorkThread(myGroup, "workThreadB");
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		
		System.out.println("[메인 스레드 그룹의 list() 메서드 호출 결과]");
		mainGroup1.list();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		// 스레드 그룹에 속한 스레드에 한번에 Interrupt() 호출 가능
		myGroup.interrupt();
		
		// 스레드가 실행 or 실행대기 상태일 때 아래처럼 interrupt 여부를 확인해서 처리할 수도 있음.
		// threadA.isInterrupted()
		
	}

}
