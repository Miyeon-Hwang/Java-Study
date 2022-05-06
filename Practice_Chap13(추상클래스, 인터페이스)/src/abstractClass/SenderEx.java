package abstractClass;

public class SenderEx {
	
	public static void main(String[] args) {
		
		// ������! �߻�Ŭ���� Ÿ�����ε� �ڼ�Ŭ���� ��ü ���� �� ����.
		ContentSender sender1 = new KakaoSender("kakao1", "name1");
		ContentSender sender2 = new SMSSender("sms", "name2");
		
		// ������ �⺻������ �޼���� �������̵� �Ǿ������� �ڼ�Ŭ������ �޼ҵ带 ȣ��
		sender1.sendMessage("�迬��", "hihi");
		System.out.println();
		sender2.sendMessage("�տ���", "hello!!");
		
		// �� �ܿ��� �ٺ��� ��� �� �����Ƿ� ContentSender�� ����� ����
		sender1.commonMethod();
		System.out.println(sender1.getName());
		//sender2.childMethod(); // �ٺ��� ContentSender�̹Ƿ� SMSSender �޼��忡�� ������ �� ����
		
	}
}
