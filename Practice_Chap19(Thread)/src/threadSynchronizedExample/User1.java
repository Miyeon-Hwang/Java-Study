package threadSynchronizedExample;

public class User1 extends Thread {
	
	// ���� ��ü
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User1");
	}
	
	@Override
	public void run() {
		this.calculator.addVal(1, 10);
	}

}
