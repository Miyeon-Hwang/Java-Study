package example01;

class Test {
	int id;
}

public class ClassArrEx {
	
	public static void main(String[] args) {
		
		// ��ü �迭�� �޸� �� ��� �Ҵ�Ǵ°�?
		// �⺻�����δ� 2���� �迭�� ������.
		
		// 1. stack ������ tests ����, �� �ּҸ� ������ 4 byte �޸� �Ҵ�
		// 2. heap ������ 10 ���� Test ��ü�� �ּҸ� ������ �޸� �Ҵ�(4byte * 10)
		Test[] tests = new Test[10];
		
		System.out.println(tests);
		for (int i=0; i < tests.length; i++) {
			System.out.println(i + "��° Test ��ü �ּ� �� : " + tests[i]); // �޸𸮸� �Ҵ�ǰ� Test ��ü�� ���� �ּҰ��� ������� �ʾұ� ������ null�� ���ϵ�.
		}
		
		for (int i=0; i < tests.length; i++) {
			// 3. Test ��ü�� �ϳ��� �����ϰ� �� �ּҸ� 2������ �Ҵ��� �޸𸮿� �ϳ��� �������ִ� ��
			tests[i] = new Test();
			System.out.println(i +  "��° Test ��ü �ּ� �� : " + tests[i]);
		}
	}
}
