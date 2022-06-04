package arraysExample;

import java.util.Arrays;
import java.util.Objects;

public class ArrayEqualsEx {
	
	// * Arrays.equals, Objects.equals 차이
	  // - Objects.equals()는 단순히 매개변수로 넘겨준 비교객체의 주소값을 비교
	  // - Arrays.equals()는 각 배열요소의 equals 결과를 리턴 
	// * Arrays.deepEquals, Objects.deepEquals는 같음
	
	public static void main(String[] args) {
		
		int[] ori = new int[] {1,2};
		int[] cloned = Arrays.copyOf(ori, ori.length);
		System.out.println(ori);
		System.out.println(cloned);
		
		// 얕은비교 
		System.out.println(Arrays.equals(ori, cloned)); // 1차원배열에서 값을 비교
		System.out.println(Objects.equals(ori, cloned)); // 단순 배열객체의 주소값만 비교
		// 깊은 비교
		System.out.println(Objects.deepEquals(ori, cloned)); // 배열 내의 값을 비교
		
		
		System.out.println("============================");
		
		
		int[][] ori2 = new int[][] {
										{1,2},
										{3,4}
									};
		int[][] cloned2 = Arrays.copyOf(ori2, ori2.length);
		System.out.println(ori2);
		System.out.println(cloned2);
		
		// 얕은 복사니까 아래 두 주소값은 같음
		System.out.println(ori2[0]);
		System.out.println(cloned2[0]);
		
		// 얕은비교 
		System.out.println(Arrays.equals(ori2, cloned2)); // 얕은 복사이므로 각 배열 요소의 주소값이 같으므로 true 리턴
		System.out.println(Objects.equals(ori2, cloned2)); // 단순 배열객체의 주소값만 비교
		System.out.println(Objects.equals(ori2[0], cloned2[0])); // 주소값 같으니까
		// 깊은 비교
		System.out.println(Objects.deepEquals(ori2, cloned2)); // 배열객체 내의 값을 비교
		
		cloned2[1][1] = 100;
		System.out.println(ori2[1][1]);
		System.out.println(cloned2[1][1]);
		
		System.out.println("============================");
		
		
		cloned2[0] = Arrays.copyOf(ori2[0], ori2[0].length);
		cloned2[1] = Arrays.copyOf(ori2[1], ori2[1].length);
		// 깊은 복사했으므로 아래 두 배열의 주소값 다름.
		System.out.println(ori2[0]);
		System.out.println(cloned2[0]);
		// 얕은비교 
		System.out.println(Arrays.equals(ori2, cloned2)); // 깊은 복사했으므로 배열의 각 요소의 주소값이 다르므로 false 리턴
		System.out.println(Objects.equals(ori2, cloned2));
		// 깊은 비교
		System.out.println(Arrays.deepEquals(ori2, cloned2)); // 2차원 배열에서 값을 비교하려면 deepEquals() 사용해야
		System.out.println(Objects.deepEquals(ori2, cloned2));
		
	}

}
