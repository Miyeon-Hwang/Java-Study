package polymorphismBasic;

public class Striker extends Player{

	private int shoot;
	
	public Striker(String name, int age, int backNumber, int speed, int shoot) {
		super(name, age, backNumber, speed);
		this.setShoot(shoot);
	}

	public int getShoot() {
		return shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("shoot count : " + this.shoot);
	}
	
	public void shoot() {
		System.out.println("shoot!!!");
	}
	
	
	
	

}
