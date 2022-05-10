package objectHashcode;

import java.util.HashSet;

public class PersonEx {
	
	public static void main(String[] args) {
		
		// HashSet�� hashcode�� �������� �ߺ��� ������� �ʴ� �ڷᱸ�� (�ڼ��� �� ���� ���ǿ���)
		// �ߺ� Ȯ�� ���� : hashcode ������ Ȯ�� > ���ٸ� equals() Ȯ�� (�� �� �ܰ踦 ����ؾ� ���� ������ �ν���) 
		HashSet hashSet = new HashSet();
		
		String str1 = new String("��");
		String str2 = new String("��");
		System.out.println(str1.hashCode()); // String Ŭ���������� �ּҰ� �ƴ� ���� �������� hashcode�� �򵵷� �������̵� �Ǿ�����.
		System.out.println(str2.hashCode());
		
		hashSet.add(str1);
		hashSet.add(str2);
		System.out.println(hashSet.size()); // str1, str2 hashcode�� ���� equals()�� ���� �������� �������̵��� �Ǿ��ֱ⶧���� ���� ��ü�� �ν��Ͽ� �ѹ��� �߰���.
		hashSet.clear();
		
		// equals()�� �������̵��� ����� ���� Ŭ����
		Person per1 = new Person("ȫ�浿");
		Person per2 = new Person("ȫ�浿");
		System.out.println(per1.hashCode()); // Person���� �������̵� �Ǿ����� �ʱ⶧���� �ּҰ��� �������� �ν��Ͻ����� �ٸ� hashcode�� ���ϵ� ��
		System.out.println(per2.hashCode());
		
		hashSet.add(per1);
		hashSet.add(per2);
		System.out.println(hashSet.size()); // hashcode�� �ٸ��� equals() �񱳱��� ������ �ʰ� �ٸ���ü�� �ν��ذ� �Ѵ� �߰��ع���
		hashSet.clear();
		
		// equals(), hashcode() �� �� �������̵��� ����� ���� Ŭ����
		Person2 per3 = new Person2("�迬��");
		Person2 per4 = new Person2("�迬��");
		System.out.println(per3.hashCode());
		System.out.println(per4.hashCode());
		
		hashSet.add(per3);
		hashSet.add(per4);
		System.out.println(hashSet.size()); // �ѹ��� �߰�! (equals���� Ȯ���� �� �α� ��µ�)
	}

}
