package daemonThreadExample;

public class DaemonEx {
	public static void main(String[] args) throws Exception {
		
		AutoSaveThread ast = new AutoSaveThread();
		
		// 스레드 start() 호출전에 데몬 스레드로 설정해주어야 함
		ast.setDaemon(true);
		ast.start();
		//ast.setDaemon(true); // IllegalThreadStateException 발생
		
		Thread.sleep(5000);
		
		// daemon 스레드가 속한 스레드(메인 스레드)가 종료되면 daemon 스레드도 종료 => 종속적 관계!
		System.out.println("메인 스레드 종료");
	}
}
