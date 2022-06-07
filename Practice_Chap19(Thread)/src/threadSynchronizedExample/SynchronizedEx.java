package threadSynchronizedExample;

public class SynchronizedEx {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalculator(cal);
		
		User2 u2 = new User2();
		u2.setCalculator(cal);
		
		// ����ȭ�� �ȵ� ���¿����� �� thread�� ������ ���� ������ ��ġ�Ƿ� ���� ���׹���. ��°��� �ŷ��� �� ����.
		// synchronized Ű���带 ����Ͽ� �����尣 ����ȭ�� ���ָ� ������ü�� lock�� �ɸ��Ƿ� user1 1-> 10, user2 15 -> 60 ������ ��µ�
		u1.start();
		u2.start();
		
	}

}
