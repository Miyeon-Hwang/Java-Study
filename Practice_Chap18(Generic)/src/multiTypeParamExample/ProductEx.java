package multiTypeParamExample;

public class ProductEx {

	public static void main(String[] args) {
		
		Product<TV, String> p1 = new Product<TV, String>();
		p1.setT(new TV(2019, 9));
		p1.setM("OLED TV");
		
		System.out.println(p1.getM());
		System.out.println(p1.getT().getYear());
		
		
		Product<Car, String> p2 = new Product<Car, String>();
		p2.setT(new Car("����", 2019, 9));
		p2.setM("�׷���");
		
		System.out.println(p2.getM());
		System.out.println(p2.getT().getBrand());

	}
}
