package mathExample;

public class MathEx {

	public static void main(String[] args) {
		
		// ����� ������ �Ǽ��� ����
		System.out.println(Math.rint(5.8));
		System.out.println(Math.rint(5.2));
		
		// �ݿø��� �Ҽ� ù°�ڸ��� �ݿ�
		System.out.println(Math.round(5.4999));
		
		// Math.round()�� �Ҽ� ��°�ڸ����� �ݿø��Ϸ���?
		double value = 12.3456;
		double temp1 = value * 100;
		double temp2 = Math.round(temp1);
		value = temp2 / 100.0;
		System.out.println(value);
	}
}
