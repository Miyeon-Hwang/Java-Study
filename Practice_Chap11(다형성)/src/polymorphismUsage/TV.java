package polymorphismUsage;

public class TV extends Product{
	
	public TV() {
		super(300);
	}
	
	@Override
	public String toString() {
		return "TV";
	}

}
