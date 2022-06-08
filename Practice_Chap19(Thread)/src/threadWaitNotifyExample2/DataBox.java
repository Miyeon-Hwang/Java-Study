package threadWaitNotifyExample2;

public class DataBox {
	
	private String data;
	
	public synchronized void consumeData() {
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		System.out.println("consumerThread가 읽은 데이터 : " + this.data);
		this.data = null;
		notify();
	}
	
	public synchronized void produceData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
			
		}
		
		this.data = data;
		System.out.println("producerThread가 생성한 데이터 : " + this.data);
		notify();
	}

}
