package threadWaitNotifyExample2;

public class ProducerThread extends Thread{
	
	private DataBox databox;
	
	public ProducerThread(DataBox databox) {
		this.databox = databox;
		this.setName("ProducerThread");
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			String data = "Data" + i;
			this.databox.produceData(data);
		}
	}

}
