package polymorphismBasic;

public class Player {
	
	private String name;
	private int age;
	private int backNumber;
	private int speed;
	
	public Player(String name, int age, int backNumber, int speed) {
		super();
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBackNumber() {
		return backNumber;
	}
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void info() {
		System.out.println("player Á¤º¸-----------------------");
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("BackNumber : " + this.backNumber);
		System.out.println("Speed : " + this.speed);
	}

}
