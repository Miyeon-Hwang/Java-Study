package example01;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		// Scanner : �Է��� �ޱ� ���� class, �Է½�Ʈ��
		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ���ڸ��� �Է� : ");
//		int input = sc.nextInt();
//		System.out.println("����ڷκ��� �Է¹��� ���� : " +  input);
//		
//		System.out.print("�Ǽ��� �Է� : ");
//		double input2 = sc.nextDouble();
//		System.out.println("����ڷκ��� �Է¹��� ���� : " +  input2);
//		
//		System.out.print("���ڿ��� �Է� : ");
//		String input3 = sc.next(); // next() => ������ �������� ���ڿ��Է��� ���� => �ܾ� �Է¹����� ���
//		System.out.println("����ڷκ��� �Է¹��� ���ڿ� : " +  input3);
//		
//		System.out.print("���ڿ��� �Է� : ");
//		String input4 = sc.nextLine(); // nextLint() => ���͸� �������� �� ���� �ްڴ�
//		System.out.println("����ڷκ��� �Է¹��� ���ڿ� : " +  input4);

		System.out.print("���ڿ��� ���ڸ� �Է� : ");
		String num = sc.nextLine();
		//int temp = 100 + num; // error
		int temp = 100 + Integer.parseInt(num);
		System.out.println("����ڷκ��� �Է¹��� ���� : " +  temp);
		
		
		sc.close(); // �ڿ�(Resource, Ű���� ���콺 ��)�� ����ϰ� ���� �ݵ�� �ݾ���� �Ѵ�. �ٸ����� ������ �� �ֵ���
	}

}
