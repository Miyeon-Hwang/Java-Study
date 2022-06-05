package basicExample;

// Person을 제네릭 타입으로 설계.
public class PersonGeneric<T> {
	
	//private static T staticT; // static 멤버는 타입 파라미터가 아직 결정되지 않은 상태이므로 사용할 수 없음.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
