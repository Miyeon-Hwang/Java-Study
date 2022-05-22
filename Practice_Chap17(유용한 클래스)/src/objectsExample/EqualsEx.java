package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class EqualsEx {

	public static void main(String[] args) {
		
		// wrapper Ŭ����
		Integer i1 = 100;
		Integer i2 = 100;
		
		// wrapper Ŭ�������� Object Ŭ������ equals()�� �������̵� �Ǿ�����
		System.out.println(i1.equals(i2));
		System.out.println(Objects.equals(i1, i2));
		
		
		Integer[] arr1 = new Integer[] {10, 100};
		Integer[] arr2 = new Integer[] {10, 100};
		
		// ���� ��(�ּҺ�)
		System.out.println(arr1.equals(arr2));
		System.out.println(Objects.equals(arr1, arr2));
		
		// �Ʒ� �� deepEqauls() ����, �� ��
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
	}
}
