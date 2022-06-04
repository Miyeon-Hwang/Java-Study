package arraysExample;

import java.util.Arrays;
import java.util.Objects;

public class ArrayEqualsEx {
	
	// * Arrays.equals, Objects.equals ����
	  // - Objects.equals()�� �ܼ��� �Ű������� �Ѱ��� �񱳰�ü�� �ּҰ��� ��
	  // - Arrays.equals()�� �� �迭����� equals ����� ���� 
	// * Arrays.deepEquals, Objects.deepEquals�� ����
	
	public static void main(String[] args) {
		
		int[] ori = new int[] {1,2};
		int[] cloned = Arrays.copyOf(ori, ori.length);
		System.out.println(ori);
		System.out.println(cloned);
		
		// ������ 
		System.out.println(Arrays.equals(ori, cloned)); // 1�����迭���� ���� ��
		System.out.println(Objects.equals(ori, cloned)); // �ܼ� �迭��ü�� �ּҰ��� ��
		// ���� ��
		System.out.println(Objects.deepEquals(ori, cloned)); // �迭 ���� ���� ��
		
		
		System.out.println("============================");
		
		
		int[][] ori2 = new int[][] {
										{1,2},
										{3,4}
									};
		int[][] cloned2 = Arrays.copyOf(ori2, ori2.length);
		System.out.println(ori2);
		System.out.println(cloned2);
		
		// ���� ����ϱ� �Ʒ� �� �ּҰ��� ����
		System.out.println(ori2[0]);
		System.out.println(cloned2[0]);
		
		// ������ 
		System.out.println(Arrays.equals(ori2, cloned2)); // ���� �����̹Ƿ� �� �迭 ����� �ּҰ��� �����Ƿ� true ����
		System.out.println(Objects.equals(ori2, cloned2)); // �ܼ� �迭��ü�� �ּҰ��� ��
		System.out.println(Objects.equals(ori2[0], cloned2[0])); // �ּҰ� �����ϱ�
		// ���� ��
		System.out.println(Objects.deepEquals(ori2, cloned2)); // �迭��ü ���� ���� ��
		
		cloned2[1][1] = 100;
		System.out.println(ori2[1][1]);
		System.out.println(cloned2[1][1]);
		
		System.out.println("============================");
		
		
		cloned2[0] = Arrays.copyOf(ori2[0], ori2[0].length);
		cloned2[1] = Arrays.copyOf(ori2[1], ori2[1].length);
		// ���� ���������Ƿ� �Ʒ� �� �迭�� �ּҰ� �ٸ�.
		System.out.println(ori2[0]);
		System.out.println(cloned2[0]);
		// ������ 
		System.out.println(Arrays.equals(ori2, cloned2)); // ���� ���������Ƿ� �迭�� �� ����� �ּҰ��� �ٸ��Ƿ� false ����
		System.out.println(Objects.equals(ori2, cloned2));
		// ���� ��
		System.out.println(Arrays.deepEquals(ori2, cloned2)); // 2���� �迭���� ���� ���Ϸ��� deepEquals() ����ؾ�
		System.out.println(Objects.deepEquals(ori2, cloned2));
		
	}

}
