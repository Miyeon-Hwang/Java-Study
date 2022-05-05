package singleton;

public class User {
	// �̱��� ���� �������
	// �ϳ��� �ν��Ͻ��� �����ؼ� ������ ���ϰ��� �Ҷ� ���
	// ex) ����� ȯ�漳��, Ŀ�ؼ�Ǯ(?), ������Ǯ ��	
	
	// 1. �ܺο��� �������� ���ϰ� private��, class�� �ϳ��� instance�� ���� �� �ֵ��� static ����� ����.
	private static User singleton = new User();
	int cnt = 0;
	
	// 2. �ܺο��� new �����ڷ� �ν��Ͻ� �������� ���ϵ��� private ������ ����
	private User() {}
	
	// 3. �ش� Ŭ������ singleton instance�� �Ѱ��ֱ� ���� �ܺο��� ȣ���� �� �ִ� public static getter �޼��带 ����.
	public static User getSingleton() {
		return singleton;
	}
	
	public void add() {
		System.out.println("add ȣ��. cnt : " + (++cnt));
	}

}
