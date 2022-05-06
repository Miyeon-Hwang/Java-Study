package polymorphismUsage;

public class PolyArgsEx {
	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		buyer.info();
		// 1. 매개변수의 다형성 적용
		// buy()의 매개변수가 조상클래스인 Product이므로 그 자손클래스를 다 넘길 수 있음.
		// return 객체에도 동일하게 적용
		buyer.buy(new TV());
		buyer.info();
		
		buyer.buy(new Computer());
		buyer.info();
		
		//buyer.buy(new Audio()); // Product 상속받지 않은 Audio 객체를 매개변수로 넘기니 컴파일 에러
		
		System.out.println("================================");
		
		
		// 2. 배열의 다형성 적용
		Product[] products = new Product[10];
		
		System.out.println(products);
		System.out.println(products[0]); // Heap 영역에 메모리 할당만 되어있고 아직 객체가 attach 되기 전
		
		products[0] = new TV();
		System.out.println(products[0]);
		
		products[1] = new Computer();
		System.out.println(products[1]);
		
	}

}
