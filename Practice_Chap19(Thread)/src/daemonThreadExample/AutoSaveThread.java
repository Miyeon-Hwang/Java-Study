package daemonThreadExample;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업 내용 자동 저장");
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				this.save();
			} catch (InterruptedException e) {}
			
		}
	}

}
