package polymorphismUsage;

public class PolyArgsEx {
	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		buyer.info();
		// 1. �Ű������� ������ ����
		// buy()�� �Ű������� ����Ŭ������ Product�̹Ƿ� �� �ڼ�Ŭ������ �� �ѱ� �� ����.
		// return ��ü���� �����ϰ� ����
		buyer.buy(new TV());
		buyer.info();
		
		buyer.buy(new Computer());
		buyer.info();
		
		//buyer.buy(new Audio()); // Product ��ӹ��� ���� Audio ��ü�� �Ű������� �ѱ�� ������ ����
		
		System.out.println("================================");
		
		
		// 2. �迭�� ������ ����
		Product[] products = new Product[10];
		
		System.out.println(products);
		System.out.println(products[0]); // Heap ������ �޸� �Ҵ縸 �Ǿ��ְ� ���� ��ü�� attach �Ǳ� ��
		
		products[0] = new TV();
		System.out.println(products[0]);
		
		products[1] = new Computer();
		System.out.println(products[1]);
		
	}

}
