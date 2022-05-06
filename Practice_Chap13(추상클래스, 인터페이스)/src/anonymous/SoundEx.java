package anonymous;

public class SoundEx {
	
	public static void main(String[] args) {
		
		// 무명클래스 (anonymous class)
		// 여기선 인터페이스니까 익명구현객체라고도 함(조상클래스가 되면 익명자손객체)
		Soundable s = new Soundable() {
			
			int num = 10;
			
			public void innerMethod() {
				System.out.println(this.num);
				System.out.println("익명구현객체 내부에서만 사용가능한 메서드");
			}
			
			@Override
			public void sound() {
				System.out.println("익명구현객체");
				innerMethod();
			}
		};
		
		//s.innerMethoud(); // 근본에 맞지 않는 메서드를 호출하므로 에러
		s.sound();
	}

}
