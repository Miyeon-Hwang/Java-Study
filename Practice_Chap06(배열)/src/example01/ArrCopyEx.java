package example01;

import java.util.Arrays;

public class ArrCopyEx {
	public static void main(String[] args) {
		
		int[] ori = new int[] {1,2,3,4};
		int[] target = new int[10];
		System.out.println(Arrays.toString(target));
		System.out.println(target);
		
		
		// 1. �ݺ��� ����� ����
		
		// 2. System.arraycopy()
		// ���� target�� �ּҸ� �״�� ����
		// System.arraycopy(ori, 0, target, 4, ori.length);
		
		// 3. Arrays.copyOf(), Arrays.copyOfRange()
		// target�� ���ο� �迭�� ����Ű�� ��
		// target = Arrays.copyOf(ori, ori.length);
		target = Arrays.copyOfRange(ori, 2, ori.length);
		
		System.out.println(Arrays.toString(target));
		System.out.println(target);
	}
}
