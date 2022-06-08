package threadWaitNotifyExample2;

public class ConsumerThread extends Thread{
	
	private DataBox databox;
	
	public ConsumerThread(DataBox databox) {
		this.databox = databox;
		this.setName("ConsumerThread");
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			this.databox.consumeData();
			
		}
	}

}
