package basicExample;

// Person�� ���׸� Ÿ������ ����.
public class PersonGeneric<T> {
	
	//private static T staticT; // static ����� Ÿ�� �Ķ���Ͱ� ���� �������� ���� �����̹Ƿ� ����� �� ����.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
