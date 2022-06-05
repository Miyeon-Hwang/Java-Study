package genericMethodExample;

public class Util {
	
	// static<T> : static ���ʸ� �޼������� ����. ����Ÿ�԰� �Ű����� Ÿ���� �����ϰ� T Ÿ������ �޾ƾ� ��.
	// �ܺο��� T Ÿ���� �޾Ƽ� Person<T>��� ���׸� Ŭ������ �ν��Ͻ��� �����Ͽ� �����ϰڴ�.
	public static<T> Person<T> changing(T t) {
		Person<T> p = new Person<T>();
		p.setT(t);
		return p;
	}
	
	// <T> : �ν��Ͻ� ���׸� �޼��� ����
	public <T> Person<T> method(T t) {
		return null;
		}
	
	
	// Ÿ�� �Ķ������ ����!
	// �Ű����� T Ÿ���� Number Ŭ������ �� �ڼ� Ŭ�����θ� �ްڴ�
	public static<T extends Number> int compare(T t1, T t2) {
		double val1 = t1.doubleValue(); // �߻�Ŭ������ Number Ŭ������ �ڼ�Ŭ�������� �������̵� �� doubleValue() �޼��尡 ȣ���.
		double val2 = t2.doubleValue();
		return Double.compare(val1, val2);
	}
}
