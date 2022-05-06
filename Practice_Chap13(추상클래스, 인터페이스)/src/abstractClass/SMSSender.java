package abstractClass;

public class SMSSender extends ContentSender {

	public SMSSender(String title, String name) {
		super(title, name);
	}

	// �߻�Ŭ������ ����ϹǷ� ���� ���Ե� �߻�޼��� �����θ� ��� �ۼ��ؾ���(�������̵�)
	// �߻�޼��带 ��� �������� ������ �� Ŭ������ �߻�Ŭ������ ��.
	@Override
	public void sendMessage(String recipient, String content) {
		System.out.println("sms sender-------------");
		System.out.println("���� : " + this.getTitle() + ", �̸� : " + this.getName());
		System.out.println("���� : " + content + ", �޴»�� : " + recipient);
	}
	
	public void childMethod() {
		System.out.println("method only for sms");
	}

}
