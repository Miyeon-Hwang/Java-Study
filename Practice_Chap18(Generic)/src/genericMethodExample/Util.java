package genericMethodExample;

public class Util {
	
	// static<T> : static 제너릭 메서드임을 선언. 리턴타입과 매개변수 타입을 동일하게 T 타입으로 받아야 함.
	// 외부에서 T 타입을 받아서 Person<T>라는 제네릭 클래스의 인스턴스를 생성하여 리턴하겠다.
	public static<T> Person<T> changing(T t) {
		Person<T> p = new Person<T>();
		p.setT(t);
		return p;
	}
	
	// <T> : 인스턴스 제네릭 메서드 선언
	public <T> Person<T> method(T t) {
		return null;
		}
	
	
	// 타입 파라미터의 제한!
	// 매개변수 T 타입을 Number 클래스나 그 자손 클래스로만 받겠다
	public static<T extends Number> int compare(T t1, T t2) {
		double val1 = t1.doubleValue(); // 추상클래스인 Number 클래스의 자손클래스에서 오버라이딩 된 doubleValue() 메서드가 호출됨.
		double val2 = t2.doubleValue();
		return Double.compare(val1, val2);
	}
}
