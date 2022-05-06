package abstractClass;

public class KakaoSender extends ContentSender {
	
	public KakaoSender(String title, String name) {
		super(title, name);
	}

	// �߻�Ŭ������ ����ϹǷ� ���� ���Ե� �߻�޼��� �����θ� ��� �ۼ��ؾ���(�������̵�)
	// �߻�޼��带 ��� �������� ������ �� Ŭ������ �߻�Ŭ������ ��.
	@Override
	public void sendMessage(String recipient, String content) {
		System.out.println("kakao sender--------------");
		System.out.println("���� : " + this.getTitle());
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + content);
		System.out.println("�޴»�� : " + recipient);
	}

}
