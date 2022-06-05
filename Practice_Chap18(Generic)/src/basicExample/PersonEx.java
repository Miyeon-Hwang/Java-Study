package basicExample;

public class PersonEx {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setObject("홍길동"); // 업캐스팅 발생(String -> Object)
		String str1 = (String)p1.getObject(); // 다운캐스팅 발생(Object -> String)
		
		// 캐스팅이 많이 발생할수록 프로그램의 성능이 저하됨
		// Person을 generic 타입으로 선언하여 타입을 제한해주며 캐스팅을 없애줄 수 있음.
		PersonGeneric<String> p2 = new PersonGeneric<String>();
		p2.setT("김연아"); // 타입 파라미터를 String으로 정해주었기때문에 String만 매개변수로 받음
		//p2.setT(111); // 컴파일 시에 타입을 체크하여 에러를 발생시켜줌
		String str2 = p2.getT();
		
		PersonGeneric<Integer> p3 = new PersonGeneric<Integer>();
		p3.setT(100);// 자동박싱 (int -> Integer)
		int i = p3.getT(); // 자동 언박싱 (Integer -> int)
	}

}
