package daemonThreadExample;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("�۾� ���� �ڵ� ����");
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
