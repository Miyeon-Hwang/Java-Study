package threadSynchronizedExample;

public class ToiletUse extends Thread {
	
	private Toilet toilet;
	
	public ToiletUse(Toilet toilet, String name) {
		this.toilet = toilet;
		this.setName(name);
	}
	
	@Override
	public void run() {
		try {
			this.toilet.use();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
