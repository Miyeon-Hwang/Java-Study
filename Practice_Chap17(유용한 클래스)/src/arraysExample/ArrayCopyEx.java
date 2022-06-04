package arraysExample;

import java.util.Arrays;

public class ArrayCopyEx {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		
		// copyOf
		int[] cloned = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(cloned));
		
		// copyOfRange
		cloned = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println(Arrays.toString(cloned));
		
		// System.arraycopy :속도측면에서는 가장 빠름
		System.arraycopy(arr1, 0, cloned, 0, 2);
		System.out.println(Arrays.toString(cloned));
	}

}
