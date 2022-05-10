package objectClone;

import java.util.Arrays;

// Ŭ������ ������ �����Ϸ��� Clonable �������̽��� �����ؾ� ��.(�������̽� ������ ����)
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
		return "��ǰ id  : " + this.getId() + "\n"
				+ "��ǰ price : " + this.getPrice() + "\n"
				+ "�迭 �ּ� : " + this.arr + ", �迭 �� : " + Arrays.toString(arr) ;
	}
	
	public Product getClonedProduct() {
		Product cloned = null;
		try {
			// Object class�� clone() ȣ�� > ��������
			cloned = (Product)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	

}
