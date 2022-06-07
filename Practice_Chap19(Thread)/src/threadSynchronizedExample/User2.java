package threadSynchronizedExample;

public class User2 extends Thread {
	
	// °øÀ¯ °´Ã¼
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User2");
	}
	
	@Override
	public void run() {
		this.calculator.addVal(5, 10);
	}

}
