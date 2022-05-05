package polymorphismBasic;

public class MidFielder extends Player{

	private int pass;
	
	public MidFielder(String name, int age, int backNumber, int speed, int pass) {
		super(name, age, backNumber, speed);
		this.setPass(pass);
	}

	
	public int getPass() {
		return pass;
	}


	public void setPass(int pass) {
		this.pass = pass;
	}


	@Override
	public void info() {
		super.info();
		System.out.println("pass count : " + this.pass);
	}
	
	
	
	

}
