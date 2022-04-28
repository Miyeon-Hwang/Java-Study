package example01;

public class DefaultTypeEx {

	public static void main(String[] args) {
		
		// 1. ����ÿ� int���� ���� ���� Ÿ���� int�� ��ȯ �� ������ ��
		byte b1 = 127;
		byte b2 = 1;
		
		//byte b3 = b1 + b2; // int + int�� byte ������ �����ϹǷ� ������
		// int ������ �޾��ְų� ���� �� byte�� ����ĳ����
		byte b3 = (byte)(b1 + b2);
		System.out.println(b1 + " + " + b2 + " = " + b3);
		
		// char�� int�� ����ÿ��� int�� ��ȯ (ASCII CODE)
		char c = 'A';
		System.out.println("3 + " + c + " = " + (3 + c));

		// 2. ������, �Ǽ��� ���� �ÿ��� ǥ�� ������ ���� ������ ����ȯ
		float f = b1 - 10.22f; // byte + float => float + float
		System.out.println(f);
		
		//float f2 = b1 + 10.55; // ����!! byte + double �̹Ƿ� double�� �޾���� ��
	}

}
