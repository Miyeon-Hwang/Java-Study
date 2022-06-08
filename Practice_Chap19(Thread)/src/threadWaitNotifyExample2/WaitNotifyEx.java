package threadWaitNotifyExample2;

public class WaitNotifyEx {
	
	public static void main(String[] args) {
		
		DataBox db = new DataBox();
		
		ProducerThread pt = new ProducerThread(db);
		ConsumerThread ct = new ConsumerThread(db);
		
		pt.start();
		ct.start();
	}

}
