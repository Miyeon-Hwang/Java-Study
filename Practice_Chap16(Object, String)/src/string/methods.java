package string;

import java.io.UnsupportedEncodingException;

public class methods {
	
	public static void main(String[] args) {
		
		// 1. charAt()
		String ssn = "940105-2345678";
		
		if (ssn.charAt(7) == '2') {
			System.out.println("female");
		}
		else if (ssn.charAt(7) == '1') {
			System.out.println("male");
		}
		
		System.out.println("======================================");
		// 2. equals()
		String str1 = new String("ȫ�浿");
		String str2 = "ȫ�浿";
		String str3 = "ȫ�浿";
		
		// == �� �ּҺ�
		System.out.println(str1 == str2); 
		System.out.println(str2 == str3); // ���� ���ͷ��� ���� �ּҸ� ����(JVM�� ���� ���ͷ� ���̸� �ش� ��ü�ּҸ� �����ϵ��� ��)
		
		// String Ŭ������ equals()�� ���� ���ϵ��� �������̵��Ǿ�����
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("======================================");
		// 3. getBytes()
		String s1 = "�ȳ��ϼ���";
		try {
			// ���ڵ�
			byte[] byte1 = s1.getBytes("EUC-KR");
			System.out.println(byte1.length); // EUC-KR�� �ѱ� 2byte
			
			byte[] byte2 = s1.getBytes("UTF-8");
			System.out.println(byte2.length); // UTF-8�� �ѱ� 3byte
			
			// ���ڵ�
			System.out.println(new String(byte1)); // java�� ����Ʈ�� EUC-KR
			System.out.println(new String(byte2)); // ���ڵ�, ���ڵ� charSet�� ���������
			System.out.println(new String(byte2, "UTF-8")); 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println("======================================");
		// 4. indexOf()
		String s2 = "�ڹ� ���� ������ �սô� ����";
		System.out.println("ã�� ���ڿ� ���� �ε��� : " + s2.indexOf("����"));
		System.out.println(s2.indexOf("�ٺ�")); // ã�� �� ���� ���ڿ��̸� -1 ����
		System.out.println(s2.lastIndexOf("����"));
		
		
		System.out.println("======================================");
		// 5. replace(), subString() => ���ο� String ��ü ����
		String s = "�ȳ� �ڹ� ���� ����";
		System.out.println(s.replace("�ڹ�", "����"));
		System.out.println(s);
		
		String num = "01012345678";
		System.out.println(num.substring(5, 8));
		
		
		System.out.println("======================================");
		// 6. valueOf()
		String ss = String.valueOf(false);
		System.out.println(ss);
		System.out.println(String.valueOf(12.555));
		
		
		
	}

}
