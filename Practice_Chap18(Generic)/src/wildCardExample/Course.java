package wildCardExample;

public class Course<T> {
	
	private String name;
	private T[] students;
	
	@SuppressWarnings("unchecked")
	public Course(String name, int size) {
		super();
		this.name = name;
		
		// T 타입이 결정되기 전이기 때문에 배열을 생성할 수 없으므로 어쩔수 없이 캐스팅
		this.students = (T[])new Object[size];
	}

	public void add(T t) {
		for (int i=0; i<this.students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

}
