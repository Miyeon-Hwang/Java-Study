package example01;

public class ThrowsAndThrowEx {
	
	// main()�� ȣ���ϴ� JVM�� ���� ó���ϵ��� ���ѱ���� ����
//	public static void main(String[] args) throws Exception{
//		method1();
//	}
	
	public static void main(String[] args) {
		try {
			method1(); // throws�� ���ܸ� �Ѱܹް������Ƿ� try-catch�� ����ó���� ���������� ������ ����
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage()); // ���� �޼����� ���
			e.printStackTrace(); // �����ڿ�(�����). ȣ�⽺�� �� ������ġ�� �� ��������. �����ÿ��� �����
		}
	}
	
	// throws : ���� ���ܸ� å�� �����ڴ�. ���� �θ����� ���ѱ�ڴ�
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		// throw : �����ڰ� ���ܸ� ���Ƿ� �߻���Ű�� ����!
		throw new Exception("������ ���� �߻���Ŵ!");
	}

}
