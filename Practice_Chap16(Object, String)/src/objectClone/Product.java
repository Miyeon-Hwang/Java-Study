package objectClone;

import java.util.Arrays;

// 클래스의 복제가 가능하려면 Clonable 인터페이스를 구현해야 함.(인터페이스 내용은 없음)
public class Product implements Cloneable{
	
	private String id;
	private int price;
	private int[] arr = new int[5];
	
	public Product(String id, int price, int[] arr) {
		this.id = id;
		this.price = price;
		this.arr = arr;
	}
	
	public String getId() {
		return id;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return arr;
	}
	
	@Override
	public String toString() {
		return "상품 id  : " + this.getId() + "\n"
				+ "상품 price : " + this.getPrice() + "\n"
				+ "배열 주소 : " + this.arr + ", 배열 값 : " + Arrays.toString(arr) ;
	}
	
	public Product getClonedProduct() {
		Product cloned = null;
		try {
			// Object class의 clone() 호출 > 얕은복제
			cloned = (Product)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	

}
