package objectClone;

import java.util.Arrays;

// 클래스의 복제가 가능하려면 Clonable 인터페이스를 구현해야 함.(인터페이스 내용은 없음)
public class Product2 implements Cloneable{
	
	private String id;
	private int price;
	private int[] arr = new int[5];
	
	public Product2(String id, int price, int[] arr) {
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Product2 cloned = (Product2)super.clone(); // 기본형타입은 여기서 얕은 복사로 복제됨
		// 참조타입멤버는 직접 깊은 복사하는 코드를 작성해줘야함.
		cloned.arr = Arrays.copyOf(this.arr, this.arr.length);
		return cloned;
	}
	
	public Product2 getClonedProduct() {
		Product2 cloned = null;
		try {
			// 오버라이딩된 Product2 class의 clone() 호출
			cloned = (Product2)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}


}
