package systemExample;

import java.util.Properties;

public class GetPropertyEx {
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		
		System.out.println(System.getProperty("user.name"));
		
		// Properties Ŭ������ Map�迭 �÷���(key-value)
		// �ý��� �Ӽ� ���� �ѹ��� �ޱ�
		Properties properties = System.getProperties();
		for(Object k : properties.keySet()) {
			System.out.print(k + " : ");
			System.out.println(properties.get(k));
		}
	}
}
