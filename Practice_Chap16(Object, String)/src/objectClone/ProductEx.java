package objectClone;

public class ProductEx {
	
	public static void main(String[] args) {
		
		// ���� ����
		Product p1 = new Product("a", 10, new int[] {1,2});
		Product p2 = p1.getClonedProduct();
		
		System.out.println(p1);
		System.out.println(p2);
		
		int[] arr1 = p1.getArr();
		arr1[0] = 500;
		// ���� �����̹Ƿ� ���� �ּҸ� �����ϰ��־� �Ѵ� ���� �ٲ�
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("==========================================");
		// ���� ����
		Product2 p3 = new Product2("a", 10, new int[] {1,2});
		Product2 p4 = p3.getClonedProduct();
		
		System.out.println(p3);
		System.out.println(p4); // ���� �����̹Ƿ� �迭�� �ּҰ��� �޶���
		
		int[] arr2 = p3.getArr();
		arr2[0] = 500;
		// ���� �����̹Ƿ� p3������ �迭���� �ٲ�
		System.out.println(p3);
		System.out.println(p4);
		
		
		
	}

}
