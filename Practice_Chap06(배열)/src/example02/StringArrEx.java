package example02;

public class StringArrEx {
	public static void main(String[] args) {
		// String �迭 (Class ��ü �迭)
		// �޸� ������ 2���� �迭�� ����
		String[] str = new String[] { "asdf", "qewr" };
		
		System.out.println(str);
		// �������ڸ�, ��½�Ʈ���� ���������� ������ Object toString()�� ����� �ּҰ� ���
		// �׷��� 2���� �迭�̸� �ּҰ��� ����������
		// String���� toString()�� �������̵� �Ǿ��ֱ� ������ �ּҰ��� �ƴ� string ���� ���ϵ�
		System.out.println(str[0]);
		
		// ���� for ��
		for (String s : str) {
			System.out.println(s);
		}
	}

}
