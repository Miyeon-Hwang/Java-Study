package example01;

public class ThrowsAndThrowEx {
	
	// main()을 호출하는 JVM이 에외 처리하도록 떠넘길수도 있음
//	public static void main(String[] args) throws Exception{
//		method1();
//	}
	
	public static void main(String[] args) {
		try {
			method1(); // throws로 예외를 넘겨받고있으므로 try-catch로 예외처리를 하지않으면 컴파일 에러
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage()); // 에러 메세지만 출력
			e.printStackTrace(); // 개발자용(디버깅). 호출스택 및 에러위치를 다 리턴해줌. 배포시에는 빼줘야
		}
	}
	
	// throws : 내가 예외를 책임 안지겠다. 나를 부른곳에 떠넘기겠다
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		// throw : 개발자가 예외를 고의로 발생시키기 위한!
		throw new Exception("강제로 예외 발생시킴!");
	}

}
