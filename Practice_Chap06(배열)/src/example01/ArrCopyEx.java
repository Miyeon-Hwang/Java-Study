package example01;

import java.util.Arrays;

public class ArrCopyEx {
	public static void main(String[] args) {
		
		int[] ori = new int[] {1,2,3,4};
		int[] target = new int[10];
		System.out.println(Arrays.toString(target));
		System.out.println(target);
		
		
		// 1. 반복문 사용한 복사
		
		// 2. System.arraycopy()
		// 기존 target의 주소를 그대로 유지
		// System.arraycopy(ori, 0, target, 4, ori.length);
		
		// 3. Arrays.copyOf(), Arrays.copyOfRange()
		// target이 새로운 배열을 가리키게 됨
		// target = Arrays.copyOf(ori, ori.length);
		target = Arrays.copyOfRange(ori, 2, ori.length);
		
		System.out.println(Arrays.toString(target));
		System.out.println(target);
	}
}
