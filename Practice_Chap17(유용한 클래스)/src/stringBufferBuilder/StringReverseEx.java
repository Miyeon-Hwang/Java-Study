package stringBufferBuilder;

public class StringReverseEx {
	
	public static void main(String[] args) {
		// String Ŭ�������� reverse �޼ҵ� ����
		// StringBuilder Ŭ������ reverse �޼ҵ带 ���
		String str1 = "�ȳ��ϼ���";
		System.out.println(Reverse(str1));
		
		
	}
	
	public static String Reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
