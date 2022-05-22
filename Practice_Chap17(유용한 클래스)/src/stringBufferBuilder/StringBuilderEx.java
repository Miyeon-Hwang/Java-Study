package stringBufferBuilder;

public class StringBuilderEx {

	// Builder�� �̱۽�����, Buffer�� ��Ƽ�����忡�� ����Ѵٴ� ���̸� �ְ� �������� ������
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.hashCode());
		
		sb.append(" study");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.insert(1, "����");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.setCharAt(1, 'r');
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.reverse());
		System.out.println(sb);
	}
}
