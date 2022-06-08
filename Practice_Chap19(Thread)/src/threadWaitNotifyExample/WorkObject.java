package threadWaitNotifyExample;

public class WorkObject {
	
	// wait(), notify(), notifyAll()은 동기화 메서드/블럭에서만 사용가능함
	// 스레드 간에 서로 번갈아가며 작업을 처리해야 하는 경우 사용
	// 본인 차례가 아닌 동안에 스레드가 계속 도는게 아니라 대기 상대로 빠졌다가 신호가 오면 실행대기 상태로 가져오고
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 실행");
		notify(); // object 내에 wait()에 의해 BLOCKED 된 스레드가 있다면 그 중 하나를 실행대기 상태로 깨움
		
		try {
			wait(); // 무한정 대기 상태로 변경(다른 스레드에서 notify()를 호출할 때까지)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 실행");
		notify(); // wait()에 의해 BLOCKED 된 스레드를 실행대기 상태로 깨움
		
		try {
			wait(); // 무한정 대기 상태로 변경(다른 스레드에서 notify()를 호출할 때까지)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
