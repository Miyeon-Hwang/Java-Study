package genericMethodExample;

public class PersonEx {
	
	public static void main(String[] args) {
		
		Person<Integer> p1 = Util.changing(100);
		System.out.println(p1.getT());
		
		
		System.out.println(Util.compare(100, 200));
		System.out.println(Util.compare(100.22, 100));
		//Util.compare("김김", "이이"); // Number 클래스의 하위클래스가 아니기 때문에 컴파일 에러
	}

}
