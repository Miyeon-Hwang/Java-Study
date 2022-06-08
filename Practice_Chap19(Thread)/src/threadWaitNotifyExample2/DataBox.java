package threadWaitNotifyExample2;

public class DataBox {
	
	private String data;
	
	public synchronized void consumeData() {
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		System.out.println("consumerThread�� ���� ������ : " + this.data);
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
		System.out.println("producerThread�� ������ ������ : " + this.data);
		notify();
	}

}
