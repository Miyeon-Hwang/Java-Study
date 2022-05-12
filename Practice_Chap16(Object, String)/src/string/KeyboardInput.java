package string;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class KeyboardInput {
	
	public static void main(String[] args) {
		
		// 1. System.in.read
		byte[] bytes = new byte[100]; // 0���� �ڵ� �ʱ�ȭ
		
		System.out.println("�Է� : ");
		int numBytes = 0;
		try {
			// �Ű������� �Ѱ��� �迭�� input stream�� �����ϴ� �޼���. �Է¹��� ����Ʈ �� ����(ĳ�������� ����)
			// ���ڵ��� ��Ŭ���� ����Ʈ�� EUC-KR�� �Ǵ� ��(numBytes���� �ѱ��� 2byte�� ���� + �ڿ��� UTF-8�� bytes�� ���ڵ��ϴ� �ѱ��� ������) 
			numBytes = System.in.read(bytes); 
			System.out.println("�Է��� ����Ʈ �� : " + numBytes);
			
			// Byte�� ���� �Է��� ���ڿ��� ���ڵ��� �� UTF-8, EUC-KR ������ ������ ������(��Ŭ���� ���ڵ� ����Ʈ�� EUC-KR ��)
			String str = new String(bytes, 0, numBytes - 2, "EUC-KR"); // -2 ���ִ� ������ ĳ�������� ����
			//String str = new String(bytes, 0, numBytes - 2, "UTF-8"); // bytes�� UTF-8�� ���ڵ��ϸ� �ѱ��� ����. ��ǲ�� bytes�� ���� �� ��Ŭ���� ����Ʈ�� EUC-KR�� ���ڵ��Ǵµ� �̸� UTF-8�� ���ڵ��Ϸ��ϴ� �����°�
			System.out.println(str);
			
			// UTF-8 : ����,���� �� �ƽ�Ű���� 1byte, �ѱ� 3byte
			// EUC-KR : ����,���� �� �ƽ�Ű���� 1byte, �ѱ� 2byte
			byte[] b = str.getBytes(); // ����Ʈ�� "EUC-KR"�� ���ڵ�
			//byte[] b = str.getBytes("UTF-8"); 
			System.out.println(b.length);
			
			
			// @ ���ڵ�, ���ڵ����� charset�� �����ϰ� �������� �ѱ��� �ȱ���!
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 2. Scanner 
		Scanner sc = new Scanner(System.in);
		System.out.println("��ĳ�� �Է� : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		byte[] b;
		try {
			b = str.getBytes("utf-8");
			System.out.println(Arrays.toString(b)); // byte�ϱ� �����ڵ带 ��ȯ�ϴµ� �����÷ο춧���� �ѱ��� �̻��Ѱ� ��ȯ��.
		
			char[] ch = str.toCharArray(); // toCharArray()�� char �迭�� �޾Ƽ� ����ϸ� ���ڱ״�� ����
			System.out.println(ch);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
