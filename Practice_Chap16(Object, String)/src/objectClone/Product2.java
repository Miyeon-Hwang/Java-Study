package objectClone;

import java.util.Arrays;

// Ŭ������ ������ �����Ϸ��� Clonable �������̽��� �����ؾ� ��.(�������̽� ������ ����)
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
		return "��ǰ id  : " + this.getId() + "\n"
				+ "��ǰ price : " + this.getPrice() + "\n"
				+ "�迭 �ּ� : " + this.arr + ", �迭 �� : " + Arrays.toString(arr) ;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Product2 cloned = (Product2)super.clone(); // �⺻��Ÿ���� ���⼭ ���� ����� ������
		// ����Ÿ�Ը���� ���� ���� �����ϴ� �ڵ带 �ۼ��������.
		cloned.arr = Arrays.copyOf(this.arr, this.arr.length);
		return cloned;
	}
	
	public Product2 getClonedProduct() {
		Product2 cloned = null;
		try {
			// �������̵��� Product2 class�� clone() ȣ��
			cloned = (Product2)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}


}
