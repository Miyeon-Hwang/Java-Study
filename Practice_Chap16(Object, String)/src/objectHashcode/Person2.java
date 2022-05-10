package objectHashcode;

public class Person2 {
	
	private String name;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if (obj instanceof Person2) {
			Person2 person = (Person2)obj;
			if (this.name.equals(person.name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode(); // String에는 hashcode가 값을 기준으로 생성되도록 오버라이딩 되어있으니까
		// 만약 나이까지 비교해야한다면 아래와 같이 (hashcode가 십진수 이니까)
		// return this.name.hashcode() + this.age;
		// 또는, Objects.hash() 활용 -> 매개변수로 넘어온 객체가 같으면 같은 hash를 생성해줌
		// return Objects.hash(this.name, this.age);
	}
	

}
