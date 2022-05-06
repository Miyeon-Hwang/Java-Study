package abstractClass;

public class KakaoSender extends ContentSender {
	
	public KakaoSender(String title, String name) {
		super(title, name);
	}

	// 추상클래스를 상속하므로 조상에 포함된 추상메서드 구현부를 모두 작성해야함(오버라이딩)
	// 추상메서드를 모두 구현하지 않으면 현 클래스도 추상클래스가 됨.
	@Override
	public void sendMessage(String recipient, String content) {
		System.out.println("kakao sender--------------");
		System.out.println("제목 : " + this.getTitle());
		System.out.println("이름 : " + this.getName());
		System.out.println("내용 : " + content);
		System.out.println("받는사람 : " + recipient);
	}

}
