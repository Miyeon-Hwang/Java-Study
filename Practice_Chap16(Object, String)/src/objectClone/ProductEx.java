package objectClone;

public class ProductEx {
	
	public static void main(String[] args) {
		
		// 얕은 복사
		Product p1 = new Product("a", 10, new int[] {1,2});
		Product p2 = p1.getClonedProduct();
		
		System.out.println(p1);
		System.out.println(p2);
		
		int[] arr1 = p1.getArr();
		arr1[0] = 500;
		// 얕은 복제이므로 같은 주소를 참조하고있어 둘다 값이 바뀜
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("==========================================");
		// 깊은 복사
		Product2 p3 = new Product2("a", 10, new int[] {1,2});
		Product2 p4 = p3.getClonedProduct();
		
		System.out.println(p3);
		System.out.println(p4); // 깊은 복사이므로 배열의 주소값이 달라짐
		
		int[] arr2 = p3.getArr();
		arr2[0] = 500;
		// 깊은 복사이므로 p3에서만 배열값이 바뀜
		System.out.println(p3);
		System.out.println(p4);
		
		
		
	}

}
