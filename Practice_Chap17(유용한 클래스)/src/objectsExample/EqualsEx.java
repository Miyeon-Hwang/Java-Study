package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class EqualsEx {

	public static void main(String[] args) {
		
		// wrapper 클래스
		Integer i1 = 100;
		Integer i2 = 100;
		
		// wrapper 클래스에는 Object 클래스의 equals()가 오버라이딩 되어있음
		System.out.println(i1.equals(i2));
		System.out.println(Objects.equals(i1, i2));
		
		
		Integer[] arr1 = new Integer[] {10, 100};
		Integer[] arr2 = new Integer[] {10, 100};
		
		// 얕은 비교(주소비교)
		System.out.println(arr1.equals(arr2));
		System.out.println(Objects.equals(arr1, arr2));
		
		// 아래 두 deepEqauls() 동일, 값 비교
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
	}
}
