package threadGroupExample;

import java.util.Map;
import java.util.Set;

public class ThreadGroupEx {
	
	public static void main(String[] args) {
		
		// 기본적으로 자신을 생성해준 thread group으로 지정됨. 
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setName("AutoSaveThread");
		ast.setDaemon(true);
		ast.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for (Thread th : threads) {
			System.out.print("thread 이름 : " + th.getName());
			System.out.println(th.isDaemon() ? " (daemon thread)" : " (main thread)");
			System.out.println("thread group : " +  th.getThreadGroup().getName());
			System.out.println();
		}
	
	}

}
