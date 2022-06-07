package threadSynchronizedExample;

public class ToiletEx {

	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		Thread t1 = new ToiletUse(toilet, "user1");
		Thread t2 = new ToiletUse(toilet, "user2");
		Thread t3 = new ToiletUse(toilet, "user3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
