package example01;

public class VarEx01 {

	public static void main(String[] args) {
		// 1. �⺻�� ����
		int number; // int�� 4byte ��ŭ ���� �޸𸮿� ���� �޸𸮸� �Ҵ���. �ʱ�ȭ�� �������Ƿ� dummy ���� ������
		number = 100;
		
		long num1 = 10; // ��Ģ��ζ�� ������ �⺻���� int�� long���� �����Ϸ��� ���̻� l�� �ٿ��� ��. ������ ��� �����Ϸ��� �˾Ƽ� long���� �ν��ϱ� ��
		float num2 = 1.1f; // �Ǽ��� �⺻���� double�̹Ƿ� float�� ���̻� f�� �ٿ���� ��.
		
		// 2. ������ ����(�⺻�� ���� ��)
		// ������ ������ �����ϸ� �ּҰ��� �����ϱ� ���� 4byte �޸𸮰� ���ÿ����� �Ҵ�ǰ�
		// new�� �ϹǷ� heap �޸𸮿��� String class�� ũ�⸸ŭ �޸𸮰� �Ҵ�� �� "java"��� ���� ����
		// �ش� heap �޸��� �ּҰ��� ���ÿ��� ������ ������ 16������ �����.
		String str = new String("java");
		System.out.println(str);
		System.out.println(str.toString());
		str = null; // �ּҰ��� �����ϰ� �ִ� ���ÿ����� ������ null�� �����. 
		System.out.println(str);
		
		// ���������Ŭ������ toString() �����Ǹ� ���� ���� Ŭ������ ���������� ��½ÿ� "Ŭ����Ÿ��@16�����ּҰ�"���� ����
		Object obj1 = new Object();
		System.out.println(obj1); // out : java.lang.Object@1c4af82c <= "Ŭ����Ÿ��@16�����ּҰ�"
		
		// 3. ��� : final keyword ���!
		final int num3 = 100;
		//num3 = 200; // error
	}

}
