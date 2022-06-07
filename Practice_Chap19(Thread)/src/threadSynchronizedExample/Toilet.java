package threadSynchronizedExample;

public class Toilet {
	
	private boolean isAvailable = true;
	
	public void use() throws Exception {
		String name = Thread.currentThread().getName();
		
		if (this.isAvailable) {
			System.out.println(name + "is in.");
			this.isAvailable = false;
			
			Thread.sleep(1000);
			System.out.println(name + "is out");
			
			this.isAvailable = true;
			System.out.println();
		}
		else {
			System.out.println("Toilet is not available. Please wait!");
		}
	}
}
