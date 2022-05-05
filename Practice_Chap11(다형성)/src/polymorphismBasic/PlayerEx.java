package polymorphismBasic;

public class PlayerEx {
	
	public static void main(String[] args) {
		
		// 1. 다형성 멤버 접근 방식
		// 멤버변수는 현재 참조변수의 타입을 따라감. 즉, 근본을 벗어나지 못함
		// 멤버메서드는 참조하고있는 인스턴스 타입의 영향을 받음. 즉, 인스턴스에서 해당 멤버 메서드를 오버라이딩하고있다면 해당 메서드를 호출. 없으면 부모의 메서드를 호출
		Player p1 = new Player("이동국", 30, 20, 60);
		p1.info();
		System.out.println();
		
		// 다형성 적용
		Player p2 = new Striker("손흥민", 30, 30, 80, 50);
		p2.info(); // Striker class에서 오버라이딩된 info()가 호출됨.
		//p2.getShoot(); // getShoot 메서드는 Player에는 없고 Striker에만 있는 멤버. p2의 근본은 Player 이므로 shoot에는 접근할 수 없다. 부모클래스 getter만 호출 가능
		System.out.println();
		
		Player p3 = new MidFielder("이강인", 25, 50, 40, 80);
		p3.info(); // 역시 자손클래스에 오버라이딩 되어있으므로 MidFielder의 info 메서드가 호출됨.
		System.out.println();
		
		Player p4 = new Defender("홍길동", 30, 40, 20, 40);
		p4.info(); // Defender에는 info 메서드가 오버라이딩 되어있지 않아서 player의 info를 호출함
		
		
		// 2. 다형성 형변환
		System.out.println("==========================================");
		
		// Up-Casting -> 조작할 수 있는 멤버 수가 줄어든다.
		Player p5 = p2;
		p5.info();
		//p5.shoot() // p5의 근본은 Player이므로 Striker의 멤버메서드인 shoot는 호출할 수 없음. 컴파일 에러
		
		System.out.println();
		// Down-Casting -> 조작할 수 있는 멤버가 늘어남
		Striker s1 = (Striker)p5; // 명시적 형변환 필수!!!!
		s1.info();
		s1.shoot();
		
		//Defender d1 = (Defender)s1;  // 서로 상속관계가 아니기 때문에 강제 캐스팅 불가능! Defender, Striker는 같은 부모클래스를 상속할 뿐 둘 사이에는 아무 관계가 없음!
		
		// 3. instanceof 활용
		// ctrl + t : 현재 선택된 클래스의 상속관계를 확인할 수 있는 단축키
		System.out.println("===============================================");
		if (s1 instanceof Player) {
			System.out.println("s1 can be Player");
		}
		
		if (s1 instanceof Object) {
			System.out.println("s1 can be Object");
		}
		
	}

}
