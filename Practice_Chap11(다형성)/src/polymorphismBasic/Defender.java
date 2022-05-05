package polymorphismBasic;

public class Defender extends Player{

	private int defense;
	
	public Defender(String name, int age, int backNumber, int speed, int defense) {
		super(name, age, backNumber, speed);
		this.setDefense(defense);
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}

}
