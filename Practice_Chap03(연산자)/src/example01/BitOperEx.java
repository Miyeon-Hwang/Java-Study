package example01;

public class BitOperEx {

	public static void main(String[] args) {
		// &, |, ^ ��Ʈ ������
		int x = 8;
		int y = 10;
		
		// & => �Ѵ� 1�϶��� 1
		System.out.println(x + "�� 2���� ��ȯ : " + Integer.toBinaryString(x));
		
		// | : �� �� �ϳ��� 1�̾ 1
		System.out.println(y + "�� 2���� ��ȯ : " + Integer.toBinaryString(y));
		
		System.out.println(x + "�� " + y + "�� ��Ʈ & �����ϸ�? " + (x & y));
		System.out.println(x + "�� " + y + "�� ��Ʈ | �����ϸ�? " + (x | y));
		
		// ^ => exclusive or (��Ÿ�� ����) : ���� �ٸ� �� 1
		System.out.println(x + "�� " + y + "�� ��Ʈ ^ �����ϸ�? " + (x ^ y));
	}

}
