package example01;

public class RandomEx {
	
	public static void main(String[] args) {
		//Math.random()�� 0 <= x < 1 ������ double �� x�� ����
		
		// �ֻ��� �� ���� �߻�
		int num = (int)(Math.random() * 6) + 1;
		System.out.println(num);
		
		// 0 <= x < 10 �� ���� ���� �߻�
		int num2 = (int)(Math.random() * 10);
		System.out.println(num2);
	}
}
