package basicExample;

public class PersonEx {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setObject("ȫ�浿"); // ��ĳ���� �߻�(String -> Object)
		String str1 = (String)p1.getObject(); // �ٿ�ĳ���� �߻�(Object -> String)
		
		// ĳ������ ���� �߻��Ҽ��� ���α׷��� ������ ���ϵ�
		// Person�� generic Ÿ������ �����Ͽ� Ÿ���� �������ָ� ĳ������ ������ �� ����.
		PersonGeneric<String> p2 = new PersonGeneric<String>();
		p2.setT("�迬��"); // Ÿ�� �Ķ���͸� String���� �����־��⶧���� String�� �Ű������� ����
		//p2.setT(111); // ������ �ÿ� Ÿ���� üũ�Ͽ� ������ �߻�������
		String str2 = p2.getT();
		
		PersonGeneric<Integer> p3 = new PersonGeneric<Integer>();
		p3.setT(100);// �ڵ��ڽ� (int -> Integer)
		int i = p3.getT(); // �ڵ� ��ڽ� (Integer -> int)
	}

}
