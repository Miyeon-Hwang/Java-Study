package polymorphismUsage;

public class PolyArgsEx {
	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		buyer.info();
		
		buyer.buy(new TV());
		buyer.info();
		
		buyer.buy(new Computer());
		buyer.info();
		
	}

}
