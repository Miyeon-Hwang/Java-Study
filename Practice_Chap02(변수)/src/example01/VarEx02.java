package example01;

public class VarEx02 {
	// 1. class �������� ����Ǵ� ��������� default������ �ʱ�ȭ�� �ȴ�. ��ġ�� �ʱ�ȭ�� ������.
	static boolean b; // default�� false
	public static void main(String[] args) {
		System.out.println(b);
		// ��������(�޼��� ���� ����Ǿ��ִ� ����)�� ������� �ʱ�ȭ �ʼ�!
		
		// 2. ���ڿ� + anytype => ���ڿ�
		System.out.println(7 + 8 + ""); // "15"�� ��µ�
		
		// 3.  ������ �����÷ο�
		// byte type => 2^8 => -2^7 ~ (2^7 - 1) �� �� 1bit�� ��ȣ
		byte b1 = 127;
		//byte b2 = 128; // ������ ��, �����÷ο�
		byte b2 = (byte)(b1 + 1); // looping
		byte b3 = (byte)(-128 - 1);
		System.out.println("b1 : " + b1 + ", b2 : " + b2 + ", b3 : " + b3);
		
		// 4. �� ��ȯ(Casting)
		//boolean ������ �⺻���� ���� ����ȯ ����
		byte b = 10;
		int i = b;// ���� ũ�⿡�� ū ũ����� ����ȯ�� ���� ����. �ڵ� ����ȯ (auto casting) => int i =(int)b;
		System.out.println("�ڵ�ĳ���� : " + i);
		
		int i1 = 65;
		char c1 = (char)i1;// ū ũ�⿡�� ���� ũ����� ����ȯ �� ���� <-> �Ǽ� �� ����ȯ�� ���� �Ұ�. ���� ����ȯ
		System.out.println("����ĳ����1 ���� -> ����: " + i1 + " -> " + c1); // ASCII code
		
		int i2 = 129;
		byte b4 = (byte)i2;
		float f1 = (float)i2;
		System.out.println("����ĳ����2 int -> byte: " + i2 + " -> " + b4); // ū ũ�⿡�� ���� ũ��� ��������ȯ�� �ϸ� ���� �ս��� �Ͼ! => looping
		System.out.println("����ĳ����3 ���� -> �Ǽ� : " + i2 + " -> " + f1); // ���� -> �Ǽ�
		
		float f2 = 10.55f;
		int i3 = (int)f2;
		System.out.println("����ĳ����4 �Ǽ� -> ���� : " + f2 + " -> " + i3);
		
		// 5. 2�� ���� : CPU�� ���� ������
		int x = -10;
		System.out.println(x + " -> " + Integer.toBinaryString(x)); // int�� 32��Ʈ -> 32�ڸ��� �տ��� �� 1�� ä���ذ�
	}
}
