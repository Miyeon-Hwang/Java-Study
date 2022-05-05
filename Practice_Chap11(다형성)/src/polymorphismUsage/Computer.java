package polymorphismUsage;

public class Computer extends Product{
	
	public Computer() {
		super(150);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}

}
