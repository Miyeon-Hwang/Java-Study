package example01;

import java.util.Arrays;

public class ArrEx01 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++)
		{
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		
		char[] charr = new char[] {'a', 'b', 'c'};
		
		
		// Arrays : �迭 utility library
		System.out.println(Arrays.toString(charr));
		System.out.println(Arrays.toString(arr)); // �迭�� string���� ��������
		
		// �⺻������ ��½�Ʈ���� ��������(�迭, class ��ü ��)�� ������
		// �ڵ����� toString()�� �����(Ÿ��@16�����ּ�)�� ȣ���ϴµ�
		// char �迭������ �� �ٸ�(���簡 �����ڵ带 ����ϱ� �����̶�� �����Ѵٰ� ��.. �ٵ� �׷� ��???)
		System.out.println(arr); // toString()�� ������� �ּҰ� ����
		System.out.println(arr.toString()); // �ּҰ� ����
		System.out.println(charr);
		System.out.println(charr.toString()); // �ּҰ� ����
		
	}
}
