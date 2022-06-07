package threadPriorityExample;

public class CalcThread extends Thread {
	
	long sum;
	
	public CalcThread(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for (int i=0; i<2000000; i++) {
			sum += i;
		}
		System.out.println("calc ������ : " + this.getName());
		System.out.println(this.getName() + "�� sum : " + this.sum);
	}

}
