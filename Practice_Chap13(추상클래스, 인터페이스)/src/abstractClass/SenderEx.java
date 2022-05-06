package abstractClass;

public class SenderEx {
	
	public static void main(String[] args) {
		
		// 다형성! 추상클래스 타입으로도 자손클래스 객체 받을 수 있음.
		ContentSender sender1 = new KakaoSender("kakao1", "name1");
		ContentSender sender2 = new SMSSender("sms", "name2");
		
		// 다형성 기본개념대로 메서드는 오버라이딩 되어있으면 자손클래스의 메소드를 호출
		sender1.sendMessage("김연아", "hihi");
		System.out.println();
		sender2.sendMessage("손연재", "hello!!");
		
		// 그 외에는 근본을 벗어날 수 없으므로 ContentSender의 멤버에 접근
		sender1.commonMethod();
		System.out.println(sender1.getName());
		//sender2.childMethod(); // 근본이 ContentSender이므로 SMSSender 메서드에는 접근할 수 없음
		
	}
}
